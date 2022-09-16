package defpackage;

import android.util.Pair;
import com.google.android.youtube.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jet  reason: default package */
/* loaded from: classes3.dex */
public final class jet implements yiw {
    final /* synthetic */ jev a;
    private final boolean b;

    public jet(jev jevVar, boolean z) {
        this.a = jevVar;
        this.b = z;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Void r2 = (Void) obj;
        jev jevVar = this.a;
        jevVar.p.h(jevVar.a.getString(R.string.no_videos_found));
        jev jevVar2 = this.a;
        nni.q(jevVar2.u, null, ((agrf) jevVar2.j.get()).a().m());
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        jfa jfaVar;
        arag aragVar;
        Void r6 = (Void) obj;
        Pair pair = (Pair) obj2;
        this.a.r.clear();
        if (pair == null || pair.first == null || pair.second == null) {
            jev jevVar = this.a;
            jevVar.p.h(jevVar.a.getString(R.string.no_videos_found));
            if (!this.a.s.b().booleanValue() && (jfaVar = this.a.w) != null) {
                jfaVar.a();
            }
        } else {
            agqf agqfVar = (agqf) pair.first;
            List<agqo> list = (List) pair.second;
            if (eog.M(this.a.k) && (aragVar = agqfVar.k) != null) {
                jev jevVar2 = this.a;
                jevVar2.r.add(nni.k(jevVar2.a.getResources(), aragVar));
            }
            this.a.o.clear();
            for (agqo agqoVar : list) {
                this.a.o.add(agqoVar.f());
            }
            this.a.r.addAll(list);
            this.a.p.a();
            if (this.b) {
                final jol jolVar = this.a.e;
                agqf agqfVar2 = (agqf) pair.first;
                List list2 = (List) pair.second;
                jev jevVar3 = this.a;
                final yit c = yit.c(jevVar3.a, new jeu(jevVar3));
                if (jolVar.a.c()) {
                    String str = agqfVar2.a;
                    final amup k = amup.k(str, agqfVar2);
                    final amup k2 = amup.k(str, list2);
                    if (jolVar.a.c()) {
                        jolVar.c.execute(new Runnable() { // from class: joj
                            @Override // java.lang.Runnable
                            public final void run() {
                                jol.this.a(k, k2, c);
                            }
                        });
                    }
                }
            }
        }
        nni.q(this.a.u, pair == null ? null : (List) pair.second, ((agrf) this.a.j.get()).a().m());
    }
}
