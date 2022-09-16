package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: afsj  reason: default package */
/* loaded from: classes.dex */
public final class afsj implements cez {
    private final cez a;
    private final afsx b;

    public afsj(cez cezVar, afsx afsxVar) {
        cezVar.getClass();
        this.a = cezVar;
        this.b = afsxVar;
    }

    @Override // defpackage.cez
    public final void kV(final cff cffVar) {
        this.a.kV(cffVar);
        if (cffVar.b != null) {
            ylx.i(this.b.c(), new ylw() { // from class: afsi
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    cff cffVar2 = cff.this;
                    if (((Boolean) obj).booleanValue()) {
                        zep.g(String.format(Locale.US, "Full response from error: %s", new String(cffVar2.b.b)));
                    }
                }
            });
        }
    }
}
