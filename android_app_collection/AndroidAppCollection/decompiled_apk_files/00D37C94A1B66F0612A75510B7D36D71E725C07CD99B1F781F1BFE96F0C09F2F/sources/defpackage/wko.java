package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: wko  reason: default package */
/* loaded from: classes4.dex */
public final class wko implements wkl {
    private volatile apej a;
    private List b;
    private List c;
    private apyy d;
    private final aacz e;

    static {
        TimeUnit.SECONDS.toMillis(15L);
    }

    public wko(aacz aaczVar) {
        this.e = aaczVar;
    }

    private final apdl l() {
        if (this.d == null) {
            this.d = this.e.b();
        }
        apyy apyyVar = this.d;
        if (apyyVar == null || (apyyVar.b & 32) == 0) {
            return null;
        }
        apdl apdlVar = apyyVar.f;
        return apdlVar == null ? apdl.b : apdlVar;
    }

    private final apej m() {
        if (this.e.d()) {
            return this.e.a();
        }
        return this.a == null ? n() : this.a;
    }

    private final synchronized apej n() {
        if (this.a == null) {
            this.a = this.e.a();
        }
        return this.a;
    }

    @Override // defpackage.wkl
    public final float a() {
        apdl l = l();
        if (l == null || (l.c & 131072) == 0) {
            return 0.0f;
        }
        return l.j;
    }

    @Override // defpackage.wkl
    public final Object b() {
        apdl l = l();
        if (l == null || (l.c & 32768) == 0) {
            return null;
        }
        atvr atvrVar = l.i;
        return atvrVar == null ? atvr.a : atvrVar;
    }

    @Override // defpackage.wkl
    public final String c() {
        String str = m().g;
        return str.isEmpty() ? "googleads.g.doubleclick.net" : str;
    }

    @Override // defpackage.wkl
    public final String d() {
        String str = m().h;
        return str.isEmpty() ? "/pagead/ads" : str;
    }

    @Override // defpackage.wkl
    public final List e() {
        List list = this.c;
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            apdl l = l();
            if (l != null) {
                for (apel apelVar : new aops(l.e, apdl.a)) {
                    arrayList.add(Integer.valueOf(apelVar.f));
                }
            }
            this.c = amuk.o(arrayList);
        }
        return this.c;
    }

    @Override // defpackage.wkl
    public final List f() {
        List list = this.b;
        if (list == null || list.isEmpty()) {
            this.b = new ArrayList();
            apdl l = l();
            if (l != null) {
                for (apge apgeVar : l.d) {
                    List list2 = this.b;
                    apgd b = apgd.b(apgeVar.b);
                    if (b == null) {
                        b = apgd.ANDROID_PLAY_STORE_ENDPOINT_INTENT_TYPE_UNKNOWN;
                    }
                    list2.add(b);
                }
            }
        }
        return this.b;
    }

    @Override // defpackage.wkl
    public final boolean g() {
        apdl l = l();
        if (l != null) {
            aoxx aoxxVar = l.f;
            if (aoxxVar == null) {
                aoxxVar = aoxx.a;
            }
            return aoxxVar.b;
        }
        return false;
    }

    @Override // defpackage.wkl
    public final boolean h() {
        return m().i;
    }

    @Override // defpackage.wkl
    public final boolean i() {
        apdl l = l();
        if (l == null) {
            return false;
        }
        return l.k;
    }

    @Override // defpackage.wkl
    public final boolean j() {
        apdl l = l();
        if (l == null) {
            return false;
        }
        return l.g;
    }

    @Override // defpackage.wkl
    public final boolean k() {
        apdl l = l();
        if (l == null) {
            return false;
        }
        return l.h;
    }
}
