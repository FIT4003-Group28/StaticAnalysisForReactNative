package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: akib  reason: default package */
/* loaded from: classes.dex */
public final class akib implements akgm, akgs {
    public final akhm a;
    public final akhv b;
    public final afvn c;
    public final ScheduledExecutorService d;
    public final ankx e;
    public final snc f;
    final akhx g;
    public final akgp h;
    public final akhn i;
    public long j;
    public final AtomicInteger k;
    public final AtomicBoolean l;
    public acvh m;
    private final vzm n;
    private final akhf o;
    private final akhi p;
    private final AtomicBoolean q;
    private final AtomicLong r;
    private final lbf s;
    private final apwt t;

    public akib(akhm akhmVar, akhv akhvVar, afvn afvnVar, vzm vzmVar, ScheduledExecutorService scheduledExecutorService, snc sncVar, apwt apwtVar, akhf akhfVar, akhi akhiVar, akgp akgpVar, akhx akhxVar, akhn akhnVar, lbf lbfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = akhmVar;
        akhvVar.getClass();
        this.b = akhvVar;
        this.g = akhxVar;
        aqxo.p(!TextUtils.isEmpty(akhmVar.a()));
        afvnVar.getClass();
        this.c = afvnVar;
        vzmVar.getClass();
        this.n = vzmVar;
        scheduledExecutorService.getClass();
        this.d = scheduledExecutorService;
        this.e = anlz.f(scheduledExecutorService);
        sncVar.getClass();
        this.f = sncVar;
        apwtVar.getClass();
        this.t = apwtVar;
        akhfVar.getClass();
        this.o = akhfVar;
        akhiVar.getClass();
        this.p = akhiVar;
        this.h = akgpVar;
        this.i = akhnVar;
        this.s = lbfVar;
        this.k = new AtomicInteger();
        this.q = new AtomicBoolean();
        this.r = new AtomicLong();
        this.l = new AtomicBoolean();
        apwt.a = akhmVar.j;
    }

    private final List l(String str) {
        ArrayList arrayList = new ArrayList();
        akgp akgpVar = this.h;
        SQLiteDatabase readableDatabase = akgpVar.a.getReadableDatabase();
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("%");
        sb.append(str);
        sb.append("%");
        Cursor query = readableDatabase.query("suggestions", akgpVar.b, "suggest_intent_query LIKE ?", new String[]{sb.toString()}, null, null, "date DESC");
        try {
            if (!query.moveToFirst()) {
                return arrayList;
            }
            int columnIndex = query.getColumnIndex("suggest_intent_query");
            do {
                arrayList.add(new akhl(query.getString(columnIndex), 1, null));
            } while (query.moveToNext());
            return arrayList;
        } finally {
            query.close();
        }
    }

    @Override // defpackage.akgm
    public final void a(akvm akvmVar) {
        throw null;
    }

    public final int b() {
        return this.k.get();
    }

    @Override // defpackage.akgs
    public final acvh c() {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029a A[Catch: IOException -> 0x02bd, TryCatch #0 {IOException -> 0x02bd, blocks: (B:71:0x01b6, B:73:0x01bc, B:76:0x01c6, B:78:0x01fe, B:80:0x0207, B:83:0x0212, B:82:0x020d, B:89:0x0228, B:91:0x022e, B:95:0x024a, B:94:0x023b, B:96:0x024e, B:98:0x0254, B:99:0x025f, B:101:0x0263, B:103:0x0269, B:104:0x027c, B:106:0x0284, B:108:0x028c, B:109:0x0294, B:111:0x029a, B:113:0x02a8, B:114:0x02aa, B:116:0x02ae, B:117:0x02b5), top: B:157:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022e A[Catch: IOException -> 0x02bd, TryCatch #0 {IOException -> 0x02bd, blocks: (B:71:0x01b6, B:73:0x01bc, B:76:0x01c6, B:78:0x01fe, B:80:0x0207, B:83:0x0212, B:82:0x020d, B:89:0x0228, B:91:0x022e, B:95:0x024a, B:94:0x023b, B:96:0x024e, B:98:0x0254, B:99:0x025f, B:101:0x0263, B:103:0x0269, B:104:0x027c, B:106:0x0284, B:108:0x028c, B:109:0x0294, B:111:0x029a, B:113:0x02a8, B:114:0x02aa, B:116:0x02ae, B:117:0x02b5), top: B:157:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0254 A[Catch: IOException -> 0x02bd, TryCatch #0 {IOException -> 0x02bd, blocks: (B:71:0x01b6, B:73:0x01bc, B:76:0x01c6, B:78:0x01fe, B:80:0x0207, B:83:0x0212, B:82:0x020d, B:89:0x0228, B:91:0x022e, B:95:0x024a, B:94:0x023b, B:96:0x024e, B:98:0x0254, B:99:0x025f, B:101:0x0263, B:103:0x0269, B:104:0x027c, B:106:0x0284, B:108:0x028c, B:109:0x0294, B:111:0x029a, B:113:0x02a8, B:114:0x02aa, B:116:0x02ae, B:117:0x02b5), top: B:157:0x01b6 }] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.akht d(java.lang.String r27, boolean r28, int r29, java.lang.String r30, boolean r31, java.lang.String r32, long r33) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akib.d(java.lang.String, boolean, int, java.lang.String, boolean, java.lang.String, long):akht");
    }

    public final String e() {
        afvv d = this.n.d((AccountIdentity) this.c.c());
        return d.g() ? d.e() : "";
    }

    public final String f() {
        return this.a.a();
    }

    public final String g() {
        afvm c = this.c.c();
        if (c == null || !c.w()) {
            return null;
        }
        return c.e();
    }

    @Deprecated
    public final synchronized Collection h(String str) {
        return k(str);
    }

    public final synchronized void i() {
        if (!this.a.d()) {
            return;
        }
        akhr akhrVar = new akhr();
        akhrVar.a = this.a.a();
        akhrVar.b = apwt.x();
        akhrVar.c = this.t.a();
        akhrVar.j = this.a.b();
        akhrVar.d = "";
        akhrVar.e();
        akhrVar.q = true;
        akhn akhnVar = this.i;
        if (akhnVar != null) {
            akhrVar.r = String.format("%04X", Integer.valueOf((char) akhnVar.c.nextInt(65536)));
        }
        lbf lbfVar = this.s;
        if (lbfVar != null && lbfVar.c()) {
            akhrVar.f();
            akhrVar.t = this.s.b();
            akhrVar.u = this.s.a();
        }
        if (this.a.e) {
            akhrVar.d(e(), g());
        }
        try {
            akhv akhvVar = this.b;
            if (akhvVar.a == null) {
                return;
            }
            akhrVar.d = "";
            akhrVar.e();
            akhvVar.b(akhrVar);
        } catch (IOException e) {
            apwt.u("Could not background-update zero-prefix cache.", e);
            zep.n("Could not background-update zero-prefix cache.", e);
        }
    }

    public final boolean j() {
        return this.a.d();
    }

    @Deprecated
    public final synchronized Collection k(String str) {
        return d(str, false, -1, null, false, null, -1L).c;
    }
}
