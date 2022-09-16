package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aknv  reason: default package */
/* loaded from: classes.dex */
public final class aknv implements ajpy {
    public final String a;
    public final aqfw b;
    public final aqfy c;
    public final aqfz d;

    public aknv(String str, aqfw aqfwVar, aqfy aqfyVar, aqfz aqfzVar) {
        this.b = aqfwVar;
        this.c = aqfyVar;
        this.d = aqfzVar;
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
        } else {
            this.a = b();
        }
    }

    final long a() {
        aqfw aqfwVar = this.b;
        if (aqfwVar != null) {
            return aqfwVar.f;
        }
        aqfy aqfyVar = this.c;
        if (aqfyVar != null) {
            return aqfyVar.e;
        }
        aqfz aqfzVar = this.d;
        if (aqfzVar == null) {
            return 0L;
        }
        return aqfzVar.e;
    }

    public final String b() {
        if (!TextUtils.isEmpty(this.a)) {
            return this.a;
        }
        aqfw aqfwVar = this.b;
        if (aqfwVar != null) {
            if ((aqfwVar.b & 512) == 0) {
                return null;
            }
            return aqfwVar.h;
        }
        aqfy aqfyVar = this.c;
        if (aqfyVar != null) {
            return aqfyVar.g;
        }
        aqfz aqfzVar = this.d;
        if (aqfzVar != null && (aqfzVar.b & 4096) != 0) {
            return aqfzVar.g;
        }
        return null;
    }

    @Override // defpackage.ajpy
    public final ajpy e(ajpy ajpyVar) {
        aknv aknvVar = (aknv) ajpyVar;
        return aknvVar.a() < a() ? this : aknvVar.a() > a() ? aknvVar : new aknv(this.a, this.b, this.c, this.d);
    }
}
