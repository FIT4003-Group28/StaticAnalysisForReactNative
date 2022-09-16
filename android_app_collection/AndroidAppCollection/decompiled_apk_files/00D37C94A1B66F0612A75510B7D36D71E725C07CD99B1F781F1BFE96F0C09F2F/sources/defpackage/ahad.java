package defpackage;
/* compiled from: PG */
/* renamed from: ahad  reason: default package */
/* loaded from: classes.dex */
public final class ahad implements agxp {
    private final aejc A;
    private final ahdd B;
    private final afja C;
    private volatile boolean D;
    private final int E;
    private final int F;
    afiz a;
    final agzt b;
    final agzt c;
    private final ahdf d;
    private final agxo e;
    private final agvx f;
    private final aanz g;
    private final agvw h;
    private final agqz i;
    private final String j;
    private final String k;
    private final String l;
    private final byte[] m;
    private final String n;
    private aegk o;
    private aegk p;
    private final ahag q;
    private final ahak r;
    private final ahak s;
    private final agpt t;
    private final snc u;
    private final zey v;
    private final int w;
    private final int x;
    private final String y;
    private final ahai z;

    public ahad(agxo agxoVar, agvx agvxVar, aanz aanzVar, snc sncVar, zey zeyVar, agqz agqzVar, agzt agztVar, agzt agztVar2, ahai ahaiVar, agvw agvwVar, agpt agptVar, afja afjaVar, ahdf ahdfVar, aejc aejcVar, ahdd ahddVar) {
        this.e = agxoVar;
        this.f = agvxVar;
        this.g = aanzVar;
        this.u = sncVar;
        this.v = zeyVar;
        this.i = agqzVar;
        this.b = agztVar;
        this.c = agztVar2;
        this.z = ahaiVar;
        this.h = agvwVar;
        this.t = agptVar;
        this.C = afjaVar;
        this.d = ahdfVar;
        this.A = aejcVar;
        this.B = ahddVar;
        int d = agxg.d(agqzVar.f);
        this.w = d;
        this.x = d;
        int am = agxg.am(agqzVar.f);
        this.E = am;
        this.F = am;
        this.y = agxg.p(agqzVar.f);
        this.j = agqzVar.a;
        this.k = zeyVar.a();
        this.l = agxg.t(agqzVar.f);
        this.m = agxg.aj(agqzVar.f);
        this.r = new ahak();
        this.s = new ahak();
        this.q = new ahag(sncVar, agvxVar.d(), new ahaf() { // from class: ahab
            @Override // defpackage.ahaf
            public final void a(long j, double d2) {
                ahad.this.b(j, d2, true);
            }
        });
        this.n = agxg.s(agqzVar.f);
    }

    private final agpw c() {
        agpw agpwVar = this.i.g;
        agxg.y(agpwVar, this.r.a() + this.s.a());
        agxg.Q(agpwVar, this.r.b() + this.s.b());
        return agpwVar;
    }

    private final void d(agxq agxqVar) {
        if (agxqVar.a) {
            Throwable cause = agxqVar.getCause();
            if (cause != null) {
                String str = this.n;
                String message = agxqVar.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(message).length());
                sb.append("[Offline] pudl task cotn [");
                sb.append(str);
                sb.append("] failed: ");
                sb.append(message);
                zep.d(sb.toString(), cause);
            } else {
                String str2 = this.n;
                String message2 = agxqVar.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(message2).length());
                sb2.append("[Offline] pudl task cotn [");
                sb2.append(str2);
                sb2.append("] failed, unknown cause: ");
                sb2.append(message2);
                zep.d(sb2.toString(), new IllegalArgumentException());
            }
        } else {
            String str3 = this.n;
            String message3 = agxqVar.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 29 + String.valueOf(message3).length());
            sb3.append("[Offline] pudl task cotn [");
            sb3.append(str3);
            sb3.append("]: ");
            sb3.append(message3);
            zep.l(sb3.toString());
        }
        afiz afizVar = this.a;
        if (afizVar != null) {
            afizVar.g();
        }
        this.e.d(this.j, agxqVar, c());
    }

    private static final boolean e(agql agqlVar, boolean z) {
        return z || (agqlVar != null && !agqlVar.i());
    }

    @Override // defpackage.agxp
    public final void a(int i) {
        String.valueOf(this.n).length();
        boolean z = true;
        this.D = true;
        if ((i & 384) != 0) {
            z = false;
        }
        aegk aegkVar = this.o;
        if (aegkVar != null) {
            aegkVar.a(z);
        }
        aegk aegkVar2 = this.p;
        if (aegkVar2 != null) {
            aegkVar2.a(z);
        }
    }

    public final void b(long j, double d, boolean z) {
        this.e.b(this.j, j, d, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0710 A[Catch: ahae -> 0x0714, Exception -> 0x0716, InterruptedException -> 0x071c, IOException -> 0x071e, agxq -> 0x0725, TRY_LEAVE, TryCatch #14 {ahae -> 0x0714, blocks: (B:203:0x070c, B:205:0x0710, B:186:0x0623, B:188:0x064a, B:190:0x065e, B:192:0x066c, B:194:0x067c, B:195:0x06b2, B:197:0x06b6, B:199:0x06be, B:200:0x06f4, B:202:0x06f8), top: B:290:0x0623 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x078d A[Catch: Exception -> 0x0943, TryCatch #22 {Exception -> 0x0943, blocks: (B:230:0x074f, B:236:0x0777, B:240:0x0785, B:242:0x078d, B:254:0x0914, B:245:0x07b3, B:246:0x07ca, B:248:0x08d7, B:249:0x08dd, B:250:0x08eb, B:252:0x08fa, B:256:0x092b, B:260:0x0938, B:262:0x093c), top: B:296:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x092b A[Catch: Exception -> 0x0943, TryCatch #22 {Exception -> 0x0943, blocks: (B:230:0x074f, B:236:0x0777, B:240:0x0785, B:242:0x078d, B:254:0x0914, B:245:0x07b3, B:246:0x07ca, B:248:0x08d7, B:249:0x08dd, B:250:0x08eb, B:252:0x08fa, B:256:0x092b, B:260:0x0938, B:262:0x093c), top: B:296:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahad.run():void");
    }
}
