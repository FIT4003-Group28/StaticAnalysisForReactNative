package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
/* compiled from: PG */
/* renamed from: aiyj  reason: default package */
/* loaded from: classes.dex */
public final class aiyj implements afwf {
    private final int a;
    private final aiyn b = new aiyn();
    private final aiyl c = new aiyl();

    public aiyj(int i) {
        this.a = i;
    }

    @Override // defpackage.afwf
    /* renamed from: b */
    public final aiyk a() {
        return new aiyk(this.a, this.b.a(), this.c.a());
    }

    public final void c(String str, int i, int i2) {
        aiyn aiynVar = this.b;
        long j = i;
        long j2 = i2;
        if (!aiynVar.b.isEmpty()) {
            String valueOf = String.valueOf((String) arey.s(aiynVar.b));
            String valueOf2 = String.valueOf(str);
            str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        aiynVar.c(str, j, (j2 != j || aiynVar.a.isEmpty()) ? j2 : ((Long) arey.s(aiynVar.a)).longValue());
    }

    public final void d(String str, int i, int i2) {
        this.b.c(str, i, i2);
    }

    public final void e(int i, SubtitleWindowSettings subtitleWindowSettings) {
        aiyl aiylVar = this.c;
        long j = i;
        if (!aiylVar.a.isEmpty() && j < ((Long) arey.s(aiylVar.a)).longValue()) {
            zep.l("subtitle settings are not given in non-decreasing start time order");
        }
        aiylVar.a.add(Long.valueOf(j));
        aiylVar.b.add(subtitleWindowSettings);
    }
}
