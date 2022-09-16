package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: apuy  reason: default package */
/* loaded from: classes2.dex */
public final class apuy {
    private final HashSet<String> b = dcnm.c();
    public final List<ilo> a = dchl.a();

    public apuy(aprw aprwVar, ckcw ckcwVar) {
        new apuw(this);
        ckhe ckheVar = (ckhe) ckcwVar.a(ckgp.e);
        for (akqi akqiVar : aprwVar.c()) {
            this.b.add(apvk.a(akqiVar));
        }
    }

    public final void a(ilo iloVar) {
        this.b.remove(apvk.a(iloVar.ai()));
        if (!this.b.isEmpty()) {
            return;
        }
        Collections.sort(this.a, new apux());
        throw null;
    }
}
