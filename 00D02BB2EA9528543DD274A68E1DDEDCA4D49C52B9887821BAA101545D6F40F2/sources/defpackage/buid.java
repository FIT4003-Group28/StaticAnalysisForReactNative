package defpackage;

import com.google.android.apps.gmm.location.model.DeviceLocation;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: buid  reason: default package */
/* loaded from: classes4.dex */
public final class buid {
    public final buhu a;
    public final buhv b;
    public final buhk c;
    public final buhl d;
    public final buhr e;
    public final buig f;
    public final buif g;
    public final buhx h;
    public final buhq i;
    public final cqat j;
    public final boolean k;
    public final Executor l;
    @dzsi
    public btlu n;
    @dzsi
    public String o;
    @dzsi
    public DeviceLocation p;
    private final buho r;
    private final dbsg<ckcz> s;
    @dzsi
    private final buad t;
    public int m = 0;
    public final AtomicBoolean q = new AtomicBoolean(false);

    public buid(buhu buhuVar, buhv buhvVar, buhk buhkVar, buhm buhmVar, buhr buhrVar, buig buigVar, buif buifVar, buhx buhxVar, buho buhoVar, buhq buhqVar, cqat cqatVar, dbsg<ckcz> dbsgVar, Executor executor, buad buadVar) {
        this.a = buhuVar;
        this.b = buhvVar;
        this.c = buhkVar;
        this.f = buigVar;
        this.g = buifVar;
        this.h = buhxVar;
        this.r = buhoVar;
        this.t = buadVar;
        btlu btluVar = buadVar.e;
        btluVar = btlu.i(btluVar) != btlt.GOOGLE ? null : btluVar;
        btrm a = buhmVar.a.a();
        buhm.a(a);
        this.d = new buhl(a, btluVar);
        ahnc ahncVar = buadVar.f;
        this.e = ahncVar != null ? new buhr(buhrVar, ahncVar) : buhrVar;
        this.i = buhqVar;
        this.l = executor;
        this.j = cqatVar;
        this.s = dbsgVar;
        this.k = buadVar.j;
    }

    public final void a() {
        if (this.q.get()) {
            this.f.c();
            buif buifVar = this.g;
            synchronized (buifVar) {
                if (buifVar.a != null) {
                    buab<String> b = buifVar.b();
                    deig<buab<String>> deigVar = null;
                    if (b != null) {
                        deig<buab<String>> deigVar2 = buifVar.a;
                        buifVar.a = null;
                        deigVar = deigVar2;
                    }
                    if (deigVar != null) {
                        deigVar.j(b);
                    }
                }
            }
            buhl buhlVar = this.d;
            if (buhlVar.b.get()) {
                buhlVar.a.a(buhlVar);
            }
            buhr buhrVar = this.e;
            if (buhrVar.h.get() && buhrVar.e != null) {
                buhrVar.g.a(buhrVar);
            }
            this.q.set(false);
        }
    }

    public final defg<buic, buic> b(final buae<List<ahnc>> buaeVar, final btzu btzuVar) {
        return new defg(this, btzuVar, buaeVar) { // from class: buia
            private final buid a;
            private final btzu b;
            private final buae c;

            {
                this.a = this;
                this.b = btzuVar;
                this.c = buaeVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final buid buidVar = this.a;
                final btzu btzuVar2 = this.b;
                buae buaeVar2 = this.c;
                final buic buicVar = (buic) obj;
                btzuVar2.d = Long.valueOf(buidVar.j.e());
                btzuVar2.l = 18;
                return deew.h(buaeVar2.a(), new dbrn(buidVar, buicVar, btzuVar2) { // from class: buib
                    private final buid a;
                    private final buic b;
                    private final btzu c;

                    {
                        this.a = buidVar;
                        this.b = buicVar;
                        this.c = btzuVar2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        buid buidVar2 = this.a;
                        buic buicVar2 = this.b;
                        btzu btzuVar3 = this.c;
                        buicVar2.a = (buab) obj2;
                        btzuVar3.e = Long.valueOf(buidVar2.j.e());
                        btzuVar3.l = 19;
                        return buicVar2;
                    }
                }, buidVar.l);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: all -> 0x008b, TryCatch #0 {, blocks: (B:11:0x002c, B:24:0x0076, B:25:0x0086, B:27:0x0088, B:14:0x0043, B:17:0x0059, B:20:0x0060), top: B:56:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[Catch: all -> 0x008b, DONT_GENERATE, TryCatch #0 {, blocks: (B:11:0x002c, B:24:0x0076, B:25:0x0086, B:27:0x0088, B:14:0x0043, B:17:0x0059, B:20:0x0060), top: B:56:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.buic r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buid.c(buic):void");
    }
}
