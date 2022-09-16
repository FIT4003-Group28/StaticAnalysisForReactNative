package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: assd  reason: default package */
/* loaded from: classes2.dex */
public final class assd implements aajq {
    public static final aajr a = new assc();
    public final aajl b;
    public final assg c;

    public assd(assg assgVar, aajl aajlVar) {
        this.c = assgVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amvlVar.j(getMetadataTextModel().a());
        amvlVar.j(getCollapsedMetadataTextModel().a());
        for (asrz asrzVar : getPollChoiceStatesMap().values()) {
            amvl amvlVar2 = new amvl();
            arag aragVar = asrzVar.b.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            amvlVar2.j(arad.b(aragVar).a(asrzVar.a).a());
            amvlVar.j(amvlVar2.g());
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
        return new assb(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof assd) && this.c.equals(((assd) obj).c);
    }

    public arag getCollapsedMetadataText() {
        arag aragVar = this.c.e;
        return aragVar == null ? arag.a : aragVar;
    }

    public arad getCollapsedMetadataTextModel() {
        arag aragVar = this.c.e;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return arad.b(aragVar).a(this.b);
    }

    public arag getMetadataText() {
        arag aragVar = this.c.d;
        return aragVar == null ? arag.a : aragVar;
    }

    public arad getMetadataTextModel() {
        arag aragVar = this.c.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return arad.b(aragVar).a(this.b);
    }

    public Map getPollChoiceStatesMap() {
        return amxp.n(Collections.unmodifiableMap(this.c.f), new ampg() { // from class: assa
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                assd assdVar = assd.this;
                aopa mo52toBuilder = ((asse) obj).mo52toBuilder();
                return new asrz((asse) mo52toBuilder.mo39build(), assdVar.b);
            }
        });
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("LiveChatPollStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
