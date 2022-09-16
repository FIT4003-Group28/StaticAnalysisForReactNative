package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aqaa  reason: default package */
/* loaded from: classes2.dex */
public final class aqaa implements aajq {
    public static final aajr a = new apzz();
    private final aajl b;
    private final aqab c;

    public aqaa(aqab aqabVar, aajl aajlVar) {
        this.c = aqabVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amzt listIterator = ((amuk) getMentionRunsModels()).listIterator();
        while (listIterator.hasNext()) {
            awso awsoVar = (awso) listIterator.next();
            amvlVar.j(new amvl().g());
        }
        amvlVar.j(getZeroStepSuccessCommandModel().a());
        amvlVar.j(getZeroStepFailureCommandModel().a());
        amvlVar.j(getShowCommentComposerDialogModel().a());
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    /* renamed from: b */
    public final apzy e() {
        return new apzy(this.c.mo52toBuilder());
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
    public final boolean equals(Object obj) {
        return (obj instanceof aqaa) && this.c.equals(((aqaa) obj).c);
    }

    public String getChannelCreationToken() {
        return this.c.k;
    }

    public String getCommentText() {
        return this.c.d;
    }

    public String getCreateCommentParams() {
        return this.c.g;
    }

    public Boolean getIsEditing() {
        return Boolean.valueOf(this.c.o);
    }

    public Boolean getIsFocused() {
        return Boolean.valueOf(this.c.p);
    }

    public Boolean getIsHidden() {
        return Boolean.valueOf(this.c.r);
    }

    public List getMentionRuns() {
        return this.c.f;
    }

    public List getMentionRunsModels() {
        amuf amufVar = new amuf();
        for (awsp awspVar : this.c.f) {
            amufVar.h(new awso((awsp) awspVar.mo52toBuilder().mo39build()));
        }
        return amufVar.g();
    }

    public String getReplyCaptionText() {
        return this.c.m;
    }

    public Boolean getShouldDisplayStoredText() {
        return Boolean.valueOf(this.c.l);
    }

    public Boolean getShouldHideComposer() {
        return Boolean.valueOf(this.c.q);
    }

    public apzg getShowCommentComposerDialog() {
        apzg apzgVar = this.c.n;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    public apzf getShowCommentComposerDialogModel() {
        apzg apzgVar = this.c.n;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        return apzf.b(apzgVar).a(this.b);
    }

    public Boolean getShowZeroStep() {
        return Boolean.valueOf(this.c.h);
    }

    public String getShownText() {
        return this.c.e;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public apzg getZeroStepFailureCommand() {
        apzg apzgVar = this.c.j;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    public apzf getZeroStepFailureCommandModel() {
        apzg apzgVar = this.c.j;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        return apzf.b(apzgVar).a(this.b);
    }

    public apzg getZeroStepSuccessCommand() {
        apzg apzgVar = this.c.i;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    public apzf getZeroStepSuccessCommandModel() {
        apzg apzgVar = this.c.i;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        return apzf.b(apzgVar).a(this.b);
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("CommentComposerTextStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
