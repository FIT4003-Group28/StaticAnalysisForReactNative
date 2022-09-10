package defpackage;

import android.app.Activity;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: bddb  reason: default package */
/* loaded from: classes3.dex */
public class bddb {
    public final bcpd a;
    public final bdcn b;
    public final bbvl c;
    public final bbtx d;
    public final WeakHashMap<appo, String> e = new WeakHashMap<>();
    private final Activity f;
    private final cqhn g;
    private final apqe h;
    private final cjqy i;

    public bddb(Activity activity, cqhn cqhnVar, apqe apqeVar, cjqy cjqyVar, bcpd bcpdVar, bdcn bdcnVar, bbvl bbvlVar, bbtx bbtxVar) {
        this.f = activity;
        this.g = cqhnVar;
        this.h = apqeVar;
        this.i = cjqyVar;
        this.a = bcpdVar;
        this.b = bdcnVar;
        this.c = bbvlVar;
        this.d = bbtxVar;
    }

    public final appj a(dwfl dwflVar) {
        appo appoVar = new appo(this.f, this.g, this.h, this.i);
        appoVar.C(new bdda(this, dwflVar.h));
        appoVar.E(this.c.b(dwflVar.h));
        appoVar.F(this.d.d);
        this.e.put(appoVar, dwflVar.h);
        return appoVar;
    }
}
