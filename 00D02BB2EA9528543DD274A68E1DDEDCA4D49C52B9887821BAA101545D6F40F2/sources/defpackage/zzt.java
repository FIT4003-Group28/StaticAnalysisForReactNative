package defpackage;
/* compiled from: PG */
/* renamed from: zzt  reason: default package */
/* loaded from: classes7.dex */
public class zzt implements zzo {
    public final bvrb a;
    private final bvsl b;
    private final zzk c;
    private final jar d;
    private final zzj e = new zzs(this);

    public zzt(bvsl bvslVar, bvrb bvrbVar, zzk zzkVar, jar jarVar) {
        this.b = bvslVar;
        this.c = zzkVar;
        this.a = bvrbVar;
        this.d = jarVar;
    }

    @Override // defpackage.zzo
    public CharSequence a() {
        return this.b.c(this.c.h(), null, false, true);
    }

    @Override // defpackage.zzo
    public CharSequence b() {
        return "";
    }

    @Override // defpackage.zzo
    public cqkl c(cjqm cjqmVar) {
        return this.d.a(cjqmVar);
    }

    public zzj d() {
        return this.e;
    }
}
