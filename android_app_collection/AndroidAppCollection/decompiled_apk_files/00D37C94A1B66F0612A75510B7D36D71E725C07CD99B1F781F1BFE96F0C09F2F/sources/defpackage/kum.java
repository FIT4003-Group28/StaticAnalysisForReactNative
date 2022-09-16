package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kum  reason: default package */
/* loaded from: classes3.dex */
public final class kum extends kuz {
    public final yzj a;
    public final fbw b;
    public final ajsm c;
    private final Executor d;
    private final agvx e;
    private final txl f;

    public kum(azqb azqbVar, aios aiosVar, txl txlVar, azqb azqbVar2, ajsg ajsgVar, Executor executor, yzj yzjVar, aacz aaczVar, aadd aaddVar, azqb azqbVar3, jlh jlhVar, mht mhtVar, fbw fbwVar, RecyclerView recyclerView, LoadingFrameLayout loadingFrameLayout, Activity activity, acti actiVar, Bundle bundle, akam akamVar, byte[] bArr, byte[] bArr2) {
        super(loadingFrameLayout, activity, actiVar, aaczVar, aaddVar, bundle, akamVar);
        this.f = txlVar;
        this.d = executor;
        this.a = yzjVar;
        this.e = ((agrf) azqbVar.get()).a();
        this.b = fbwVar;
        aiosVar.d = new aiop(activity, null);
        recyclerView.ag(new LinearLayoutManager());
        ajqw ajqwVar = new ajqw();
        ajqwVar.f(agqo.class, jlhVar);
        ajqwVar.f(agqf.class, mhtVar);
        ajqwVar.f(atfa.class, new ajsc(azqbVar2));
        ajqwVar.f(apke.class, new ajsc(azqbVar3));
        ajsm ajsmVar = new ajsm();
        this.c = ajsmVar;
        ajsf a = ajsgVar.a(ajqwVar);
        if (fbwVar.a()) {
            a.rZ(new lyv(actiVar, 1));
        }
        a.h(ajsmVar);
        recyclerView.ad(a);
    }

    public static /* synthetic */ boolean f(Object obj) {
        return !(obj instanceof agqv) || !((agqv) obj).s();
    }

    @Override // defpackage.kuz
    public final void a() {
    }

    @Override // defpackage.kuz
    public final void b(String str, String str2) {
    }

    @Override // defpackage.kuz
    public final void c(Configuration configuration) {
    }

    @Override // defpackage.kuz
    public final void d(final String str) {
        this.z.c();
        txl txlVar = this.f;
        final agvx agvxVar = this.e;
        final yiz c = yiz.c(this.d, new kul(this));
        agvxVar.getClass();
        txlVar.a.execute(new Runnable() { // from class: aguz
            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                yiw yiwVar = yiw.this;
                agvx agvxVar2 = agvxVar;
                agvb agvbVar = new agvb(str);
                Iterator it = agvxVar2.m().j().iterator();
                while (true) {
                    str2 = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    agqv agqvVar = (agqv) it.next();
                    if (kum.f(agqvVar)) {
                        agqo agqoVar = agqvVar.a;
                        if (!agvbVar.d.containsKey(agqoVar)) {
                            agd agdVar = agvbVar.d;
                            String str3 = agvbVar.a;
                            String j = agqoVar.j();
                            agqa agqaVar = agqoVar.a;
                            if (agqaVar != null) {
                                str2 = agqaVar.b;
                            }
                            agdVar.put(agqoVar, Integer.valueOf(aguy.a(str3, j, str2)));
                            agvbVar.b.add(agqoVar);
                        }
                    }
                }
                for (agqf agqfVar : agvxVar2.i().m()) {
                    if (kum.f(agqfVar) && !agvbVar.d.containsKey(agqfVar)) {
                        agd agdVar2 = agvbVar.d;
                        String str4 = agvbVar.a;
                        String str5 = agqfVar.b;
                        agqa agqaVar2 = agqfVar.c;
                        agdVar2.put(agqfVar, Integer.valueOf(aguy.a(str4, str5, agqaVar2 != null ? agqaVar2.b : str2)));
                        agvbVar.c.add(agqfVar);
                    }
                }
                ArrayList arrayList = new ArrayList(agvbVar.b.size() + agvbVar.c.size());
                ArrayList arrayList2 = agvbVar.b;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    agqo agqoVar2 = (agqo) arrayList2.get(i);
                    Integer num = (Integer) agvbVar.d.get(agqoVar2);
                    if (num != null && num.intValue() > 0) {
                        arrayList.add(agqoVar2);
                    }
                }
                ArrayList arrayList3 = agvbVar.c;
                int size2 = arrayList3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    agqf agqfVar2 = (agqf) arrayList3.get(i2);
                    Integer num2 = (Integer) agvbVar.d.get(agqfVar2);
                    if (num2 != null && num2.intValue() > 0) {
                        arrayList.add(agqfVar2);
                    }
                }
                arrayList.trimToSize();
                Collections.sort(arrayList, agvbVar.e);
                yiwVar.b(null, arrayList);
            }
        });
    }

    @Override // defpackage.kuz
    public final boolean e() {
        return false;
    }
}
