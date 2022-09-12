package defpackage;

import android.view.View;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: jvv  reason: default package */
/* loaded from: classes7.dex */
public final class jvv<T> implements noq {
    public final noo a;
    public final kcv b;
    private final not c;
    private final kdg d;
    private final jvs<T> e;
    private final jyu f;
    private final cqkf<jyn> g;
    private final jyt h = new jvu(this);

    public jvv(cqkj cqkjVar, not notVar, noo nooVar, kdg kdgVar, kcv kcvVar, dcdc<T> dcdcVar, dbrn<T, String> dbrnVar, final jwh<T> jwhVar, jyj jyjVar) {
        this.c = notVar;
        this.a = nooVar;
        this.d = kdgVar;
        this.b = kcvVar;
        final jvs<T> jvsVar = new jvs<>(dcdcVar, dbrnVar, new jwh(this, jwhVar) { // from class: jvt
            private final jvv a;
            private final jwh b;

            {
                this.a = this;
                this.b = jwhVar;
            }

            @Override // defpackage.jwh
            public final void a(int i, dcdc dcdcVar2) {
                jvv jvvVar = this.a;
                this.b.a(i, dcdcVar2);
                jvvVar.a.b();
            }
        }, jyjVar.e());
        this.e = jvsVar;
        if (jvsVar.f == null) {
            final TreeMap treeMap = new TreeMap();
            ArrayList arrayList = new ArrayList();
            treeMap.put("123", arrayList);
            String[] strArr = jvs.a;
            for (int i = 0; i < 26; i++) {
                treeMap.put(strArr[i], new ArrayList());
            }
            dcdc<T> dcdcVar2 = jvsVar.b;
            int size = dcdcVar2.size();
            for (int i2 = 0; i2 < size; i2++) {
                T t = dcdcVar2.get(i2);
                String a = cmw.a(jvsVar.c.a(t));
                List list = (List) treeMap.get(a.length() == 0 ? "" : a.substring(0, 1));
                if (list == null) {
                    arrayList.add(t);
                } else {
                    list.add(t);
                }
            }
            bvqg bvqgVar = new bvqg(jvsVar, treeMap) { // from class: jvq
                private final jvs a;
                private final Map b;

                {
                    this.a = jvsVar;
                    this.b = treeMap;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    jvs jvsVar2 = this.a;
                    Map map = this.b;
                    Integer num = (Integer) obj;
                    jvr jvrVar = new jvr(jvsVar2.c);
                    dccx dccxVar = new dccx();
                    for (List list2 : map.values()) {
                        Collections.sort(list2, jvrVar);
                        dccxVar.i(list2);
                    }
                    jvsVar2.d.a(num.intValue(), dccxVar.f());
                }
            };
            dccx dccxVar = new dccx();
            int i3 = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                dccxVar.g(new jys(!((List) entry.getValue()).isEmpty(), ((String) entry.getKey()).toString(), bvqgVar, i3, jvsVar.e));
                i3 += ((List) entry.getValue()).size();
            }
            jvsVar.f = dccxVar.f();
        }
        this.f = new jyu(jvsVar.f, this.h, jyjVar.d());
        this.g = cqkjVar.d(new jww(), ((npb) notVar).b, false);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.non
    public final void a() {
        this.g.e(this.f);
    }

    @Override // defpackage.non
    public final noq b() {
        this.b.i(this);
        this.d.d(this);
        this.f.f(!this.b.p());
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        throw null;
    }

    @Override // defpackage.non
    public final void e() {
        this.b.h(this);
        this.d.e(this);
    }

    @Override // defpackage.non
    public final void f() {
        this.g.e(null);
    }

    @Override // defpackage.non
    public final String g() {
        return "AlphaJumpKeyboardOverlay";
    }

    @Override // defpackage.non
    public final boolean h() {
        return false;
    }

    @Override // defpackage.non
    public final int i() {
        return nom.a(this);
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.c.b(noeVar, this.g.c());
    }
}
