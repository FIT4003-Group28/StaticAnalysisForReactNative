package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aqai  reason: default package */
/* loaded from: classes2.dex */
public final class aqai implements aajq {
    public static final aajr a = new aqah();
    private final aajl b;
    private final aqaj c;

    public aqai(aqaj aqajVar, aajl aajlVar) {
        this.c = aqajVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amzt listIterator = ((amuk) getCustomEmojisModels()).listIterator();
        while (listIterator.hasNext()) {
            amvlVar.j(((aquo) listIterator.next()).a());
        }
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.c.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new aqag(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqai) && this.c.equals(((aqai) obj).c);
    }

    public List getCustomEmojis() {
        return this.c.d;
    }

    public List getCustomEmojisModels() {
        amuf amufVar = new amuf();
        for (aqup aqupVar : this.c.d) {
            amufVar.h(aquo.b(aqupVar).a(this.b));
        }
        return amufVar.g();
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("CommentCustomEmojisEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
