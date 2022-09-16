package defpackage;

import android.view.TextureView;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: zsq  reason: default package */
/* loaded from: classes4.dex */
public final class zsq {
    public final String a;
    public final zsp b;
    public final zsi c;

    public zsq(String str, zsp zspVar, zsi zsiVar) {
        this.a = str;
        this.b = zspVar;
        this.c = zsiVar;
    }

    public final TextureView a() {
        return this.b.a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zsq)) {
            if (this == obj) {
                return true;
            }
            zsq zsqVar = (zsq) obj;
            if (akzj.f(this.a, zsqVar.a) && akzj.f(this.b, zsqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
