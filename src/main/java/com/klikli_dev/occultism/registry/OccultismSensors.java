/*
 * MIT License
 *
 * Copyright 2020 klikli-dev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 * OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package com.klikli_dev.occultism.registry;

import com.klikli_dev.occultism.Occultism;
import com.klikli_dev.occultism.common.entity.ai.sensor.NearestJobItemSensor;
import com.klikli_dev.occultism.common.entity.ai.sensor.NearestTreeSensor;
import com.klikli_dev.occultism.common.entity.ai.sensor.UnreachableTreeWalkTargetSensor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.sensing.SensorType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class OccultismSensors {
    public static DeferredRegister<SensorType<?>> SENSORS = DeferredRegister.create(BuiltInRegistries.SENSOR_TYPE, Occultism.MODID);

    public static final Supplier<SensorType<NearestTreeSensor<?>>> NEAREST_TREE = SENSORS.register("nearest_tree",
            () -> new SensorType<>(NearestTreeSensor::new));

    public static final Supplier<SensorType<UnreachableTreeWalkTargetSensor<?>>> UNREACHABLE_WALK_TARGET = SENSORS.register("unreachable_walk_target",
            () -> new SensorType<>(UnreachableTreeWalkTargetSensor::new));

    public static final Supplier<SensorType<NearestJobItemSensor<?>>> NEAREST_JOB_ITEM = SENSORS.register("nearest_job_item",
            () -> new SensorType<>(NearestJobItemSensor::new));
}
