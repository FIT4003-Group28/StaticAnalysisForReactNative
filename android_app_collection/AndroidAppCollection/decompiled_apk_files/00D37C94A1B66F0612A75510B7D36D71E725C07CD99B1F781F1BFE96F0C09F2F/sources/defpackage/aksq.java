package defpackage;

import com.google.android.libraries.youtube.media.player.scripted.jni.NativeSupport;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aksq  reason: default package */
/* loaded from: classes.dex */
public final class aksq {
    public final String a;
    public final List b;

    public aksq(String str) {
        this.b = new ArrayList();
        this.a = str;
    }

    public aksq(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final aoob a(Object obj) {
        byte[] nativeRetainObjectReference = NativeSupport.nativeRetainObjectReference(obj);
        this.b.add(nativeRetainObjectReference);
        return aoob.x(nativeRetainObjectReference);
    }

    public final void b() {
        for (byte[] bArr : this.b) {
            NativeSupport.nativeReleaseObjectReference(bArr);
        }
        this.b.clear();
    }
}
