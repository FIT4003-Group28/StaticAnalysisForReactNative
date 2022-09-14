package com.facebook.imagepipeline.nativecode;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class c {
    public static c.d.j.q.d a(int i, boolean z) {
        try {
            return (c.d.j.q.d) Class.forName("com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory").getConstructor(Integer.TYPE, Boolean.TYPE).newInstance(Integer.valueOf(i), Boolean.valueOf(z));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e2);
        }
    }
}
