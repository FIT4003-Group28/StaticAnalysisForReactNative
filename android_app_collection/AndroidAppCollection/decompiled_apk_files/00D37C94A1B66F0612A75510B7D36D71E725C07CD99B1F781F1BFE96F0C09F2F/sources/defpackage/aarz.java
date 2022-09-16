package defpackage;

import com.google.protos.youtube.api.innertube.AccountsListRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aarz  reason: default package */
/* loaded from: classes.dex */
public final class aarz {
    private aoxf a;
    private aoxk b;
    private aqtd c;
    private List d;
    private List e;

    public aarz(aoxf aoxfVar) {
        this.a = aoxfVar;
    }

    public aarz(List list, List list2, aoxk aoxkVar, aqtd aqtdVar) {
        ArrayList arrayList = new ArrayList(list.size());
        this.d = arrayList;
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList(list2.size());
        this.e = arrayList2;
        arrayList2.addAll(list2);
        this.b = aoxkVar;
        this.c = aqtdVar;
    }

    public final aoxk a() {
        aoxf aoxfVar;
        if (this.b == null && (aoxfVar = this.a) != null && (aoxfVar.b & 1) != 0) {
            aunb aunbVar = aoxfVar.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(AccountsListRenderer.googleAccountHeaderRenderer)) {
                aunb aunbVar2 = this.a.e;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                this.b = (aoxk) aunbVar2.qm(AccountsListRenderer.googleAccountHeaderRenderer);
            }
        }
        return this.b;
    }

    public final aqtd b() {
        aoxf aoxfVar;
        if (this.c == null && (aoxfVar = this.a) != null && (aoxfVar.b & 4) != 0) {
            aqtd aqtdVar = aoxfVar.f;
            if (aqtdVar == null) {
                aqtdVar = aqtd.a;
            }
            this.c = aqtdVar;
        }
        return this.c;
    }

    public final List d() {
        if (this.e == null) {
            aoxf aoxfVar = this.a;
            if (aoxfVar == null || aoxfVar.d.size() == 0) {
                this.e = Collections.emptyList();
            } else {
                this.e = new ArrayList();
                for (aoxd aoxdVar : this.a.d) {
                    if ((aoxdVar.b & 1) != 0) {
                        List list = this.e;
                        aowx aowxVar = aoxdVar.c;
                        if (aowxVar == null) {
                            aowxVar = aowx.a;
                        }
                        list.add(aowxVar);
                    }
                }
            }
        }
        return this.e;
    }

    public final List c() {
        aoxf aoxfVar;
        List list = this.d;
        if (list == null && (aoxfVar = this.a) != null) {
            this.d = new ArrayList(aoxfVar.c.size());
            for (aoxe aoxeVar : this.a.c) {
                if (aoxeVar.b == 63434476) {
                    this.d.add(new aary((aoxc) aoxeVar.c));
                }
            }
        } else if (list == null) {
            this.d = Collections.emptyList();
        }
        return this.d;
    }
}
