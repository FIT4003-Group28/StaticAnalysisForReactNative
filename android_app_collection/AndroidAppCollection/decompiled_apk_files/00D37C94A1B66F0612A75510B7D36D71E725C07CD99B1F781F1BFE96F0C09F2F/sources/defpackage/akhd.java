package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: akhd  reason: default package */
/* loaded from: classes.dex */
public final class akhd implements akhx {
    private final akhv a;

    public akhd(akhv akhvVar) {
        akhvVar.getClass();
        this.a = akhvVar;
    }

    @Override // defpackage.akhx
    public final akhe a(akhr akhrVar) {
        try {
            return this.a.b(akhrVar);
        } catch (IOException e) {
            apwt.u("OnlineSuggestSource exception", e);
            return akhe.a;
        }
    }
}
