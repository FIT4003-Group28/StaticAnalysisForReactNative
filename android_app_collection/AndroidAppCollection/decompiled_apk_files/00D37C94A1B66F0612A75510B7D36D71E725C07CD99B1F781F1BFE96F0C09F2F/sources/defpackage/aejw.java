package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aejw  reason: default package */
/* loaded from: classes.dex */
public final class aejw extends aflg {
    private final aflm a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aejw(asv asvVar, aflm aflmVar) {
        super(asvVar);
        afms.a(asvVar);
        afms.a(aflmVar);
        this.a = aflmVar;
    }

    @Override // defpackage.aflg, defpackage.asv
    public final long h(asy asyVar) {
        String queryParameter;
        if (!this.b && (queryParameter = asyVar.a.getQueryParameter("itag")) != null) {
            try {
                int parseInt = Integer.parseInt(queryParameter);
                Set b = aank.b();
                Integer valueOf = Integer.valueOf(parseInt);
                if (b.contains(valueOf)) {
                    this.b = true;
                    this.a.H();
                } else if (aank.c().contains(valueOf) || aank.v().contains(valueOf)) {
                    this.b = true;
                    this.a.I();
                }
            } catch (NumberFormatException unused) {
            }
        }
        return super.h(asyVar);
    }
}
