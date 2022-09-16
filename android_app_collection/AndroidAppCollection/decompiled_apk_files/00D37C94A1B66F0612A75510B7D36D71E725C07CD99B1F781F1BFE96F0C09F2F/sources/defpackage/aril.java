package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aril  reason: default package */
/* loaded from: classes2.dex */
public final class aril implements aajq {
    public static final aajr a = new arik();
    private final arii b;

    public aril(arii ariiVar) {
        this.b = ariiVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        return new amvl().g();
    }

    @Override // defpackage.aajj
    /* renamed from: b */
    public final arij e() {
        return new arij(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aril) && this.b.equals(((aril) obj).b);
    }

    public Long getDisplayTime() {
        return Long.valueOf(this.b.d);
    }

    public Boolean getIsNoneOfTheAboveSelected() {
        return Boolean.valueOf(this.b.f);
    }

    public List getIsSelected() {
        return this.b.e;
    }

    public Float getNumSelected() {
        return Float.valueOf(this.b.g);
    }

    public aved getSurveyState() {
        aved b = aved.b(this.b.h);
        return b == null ? aved.SURVEY_STATE_TYPE_UNKNOWN : b;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("SurveyStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
