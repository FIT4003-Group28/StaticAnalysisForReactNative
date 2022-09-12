package com.google.ar.sceneform.rendering;

import com.google.ar.sceneform.rendering.Texture;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextureInternalData extends dbiw {
    private static final Map<Long, Integer> c = new HashMap();
    public com.google.android.filament.Texture a;
    public final Texture.Sampler b;

    public TextureInternalData(com.google.android.filament.Texture texture, Texture.Sampler sampler) {
        this.a = texture;
        long nativeObject = texture.getNativeObject();
        Map<Long, Integer> map = c;
        synchronized (map) {
            Long valueOf = Long.valueOf(nativeObject);
            int i = 1;
            if (map.containsKey(valueOf)) {
                Integer num = map.get(valueOf);
                dbjb.c(num);
                i = 1 + num.intValue();
            }
            map.put(valueOf, Integer.valueOf(i));
        }
        this.b = sampler;
    }

    @Override // defpackage.dbiw
    protected final void a() {
        int intValue;
        dbix.a();
        com.google.android.filament.Texture texture = this.a;
        dbjb.c(texture);
        long nativeObject = texture.getNativeObject();
        Map<Long, Integer> map = c;
        synchronized (map) {
            Long valueOf = Long.valueOf(nativeObject);
            Integer num = map.get(valueOf);
            dbjb.c(num);
            intValue = num.intValue() - 1;
            map.put(valueOf, Integer.valueOf(intValue));
        }
        if (intValue == 0) {
            dbet a = EngineInstance.a();
            com.google.android.filament.Texture texture2 = this.a;
            this.a = null;
            if (texture2 == null || a == null || !a.a()) {
                return;
            }
            a.j(texture2);
        }
    }
}
