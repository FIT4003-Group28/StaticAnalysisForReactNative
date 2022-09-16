package defpackage;
/* compiled from: PG */
/* renamed from: avca  reason: default package */
/* loaded from: classes2.dex */
public final class avca implements aajq {
    public static final aajr a = new avbz();
    public final avcb b;
    private final aajl c;

    public avca(avcb avcbVar, aajl aajlVar) {
        this.b = avcbVar;
        this.c = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amvlVar.j(getEmojiModel().a());
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.b.f;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new avby(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof avca) && this.b.equals(((avca) obj).b);
    }

    public avcc getAction() {
        avcc b = avcc.b(this.b.g);
        return b == null ? avcc.SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN : b;
    }

    public aqup getEmoji() {
        avcb avcbVar = this.b;
        if (avcbVar.d == 3) {
            return (aqup) avcbVar.e;
        }
        return aqup.a;
    }

    public aquo getEmojiModel() {
        aqup aqupVar;
        avcb avcbVar = this.b;
        if (avcbVar.d == 3) {
            aqupVar = (aqup) avcbVar.e;
        } else {
            aqupVar = aqup.a;
        }
        return aquo.b(aqupVar).a(this.c);
    }

    public Boolean getShouldAppendWhitespace() {
        return Boolean.valueOf(this.b.h);
    }

    public Boolean getShouldConditionallyPrependWhitespace() {
        return Boolean.valueOf(this.b.i);
    }

    public String getText() {
        avcb avcbVar = this.b;
        return avcbVar.d == 2 ? (String) avcbVar.e : "";
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("SuggestEditableTextItemEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
