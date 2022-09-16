package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: aley  reason: default package */
/* loaded from: classes.dex */
public final class aley extends algt {
    public final Context a;
    public final albf b;

    public aley(Context context, albf albfVar, alht alhtVar) {
        super(avuo.UPLOAD_PROCESSOR_TYPE_GARBAGE_COLLECTION, albfVar, alhtVar);
        this.a = context;
        this.b = albfVar;
    }

    public static boolean c(alcw alcwVar) {
        if (!alcwVar.ad) {
            if (alcwVar.ac) {
                return false;
            }
            amuk amukVar = akzk.a;
            alcv a = alcv.a(alcwVar.X);
            if (a == null) {
                a = alcv.UNKNOWN;
            }
            return amukVar.contains(a);
        }
        return true;
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return null;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        return null;
    }

    @Override // defpackage.algt
    public final ankt d(String str, akzp akzpVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.algt
    public final aypx e() {
        return null;
    }

    @Override // defpackage.algt
    public final String f() {
        return "GarbageCollectionTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return false;
    }

    @Override // defpackage.algt
    public final boolean j() {
        return false;
    }

    @Override // defpackage.algt
    public final akzs m(Throwable th, String str, akzp akzpVar, boolean z) {
        return new alex(this.b);
    }

    @Override // defpackage.algt
    public final ankt p(final String str, final akzp akzpVar) {
        return anlz.v(new aniq() { // from class: alev
            @Override // defpackage.aniq
            public final ankt a() {
                aley aleyVar = aley.this;
                alcw b = akzpVar.b(str);
                if (b != null && (b.b & 2) != 0) {
                    try {
                        aleyVar.a.getContentResolver().releasePersistableUriPermission(Uri.parse(b.f), 1);
                    } catch (SecurityException unused) {
                    }
                }
                if (b == null || !aley.c(b)) {
                    return anlz.q(new alew(aleyVar.b));
                }
                return anlz.q(new akzr());
            }
        }, anjk.a);
    }
}
