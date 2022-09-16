package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: awkg  reason: default package */
/* loaded from: classes2.dex */
public final class awkg implements aajq {
    public static final aajr a = new awkf();
    public final aajl b;
    public final awki c;

    public awkg(awki awkiVar, aajl aajlVar) {
        this.c = awkiVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        avhn avhnVar;
        amvl amvlVar = new amvl();
        awki awkiVar = this.c;
        if ((awkiVar.c & 8) != 0) {
            amvlVar.c(awkiVar.f);
        }
        if (this.c.l.size() > 0) {
            amvlVar.j(this.c.l);
        }
        if (this.c.m.size() > 0) {
            amvlVar.j(this.c.m);
        }
        amvlVar.j(getDescriptionModel().a());
        amvlVar.j(getFormattedDescriptionModel().a());
        amvlVar.j(getThumbnailModel().a());
        for (aueh auehVar : getThumbnailStyleDataMap().values()) {
            amvl amvlVar2 = new amvl();
            auej auejVar = auehVar.b;
            if (auejVar.b == 1) {
                avhnVar = (avhn) auejVar.c;
            } else {
                avhnVar = avhn.a;
            }
            amvlVar2.j(avhr.b(avhnVar).a(auehVar.a).a());
            aueg a2 = auehVar.a();
            amvl amvlVar3 = new amvl();
            avhn avhnVar2 = a2.b.c;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            amvlVar3.j(avhr.b(avhnVar2).a(a2.a).a());
            amvlVar2.j(amvlVar3.g());
            amvlVar.j(amvlVar2.g());
        }
        return amvlVar.g();
    }

    public final amuk b() {
        amuf amufVar = new amuf();
        for (String str : this.c.l) {
            aajj b = this.b.b(str);
            if (b != null) {
                if (b instanceof awkp) {
                    amufVar.h((awkp) b);
                } else {
                    String valueOf = String.valueOf(b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Entity ");
                    sb.append(valueOf);
                    sb.append(" is not a YtMainPlaylistVideoEntityModel");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return amufVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.c.d;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new awke(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof awkg) && this.c.equals(((awkg) obj).c);
    }

    public final List f() {
        return this.c.l;
    }

    public awma getDescription() {
        awma awmaVar = this.c.h;
        return awmaVar == null ? awma.a : awmaVar;
    }

    public awlt getDescriptionModel() {
        awma awmaVar = this.c.h;
        if (awmaVar == null) {
            awmaVar = awma.a;
        }
        return awlt.b(awmaVar).a(this.b);
    }

    public arag getFormattedDescription() {
        arag aragVar = this.c.i;
        return aragVar == null ? arag.a : aragVar;
    }

    public arad getFormattedDescriptionModel() {
        arag aragVar = this.c.i;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return arad.b(aragVar).a(this.b);
    }

    public String getPlaylistId() {
        return this.c.e;
    }

    public avhn getThumbnail() {
        avhn avhnVar = this.c.k;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public avhr getThumbnailModel() {
        avhn avhnVar = this.c.k;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        return avhr.b(avhnVar).a(this.b);
    }

    public Map getThumbnailStyleDataMap() {
        return amxp.n(Collections.unmodifiableMap(this.c.n), new ampg() { // from class: awkd
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                awkg awkgVar = awkg.this;
                aopa mo52toBuilder = ((auej) obj).mo52toBuilder();
                return new aueh((auej) mo52toBuilder.mo39build(), awkgVar.b);
            }
        });
    }

    public String getTitle() {
        return this.c.g;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public awkl getVisibility() {
        awkl b = awkl.b(this.c.j);
        return b == null ? awkl.PLAYLIST_VISIBILITY_UNKNOWN : b;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("YtMainPlaylistEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
