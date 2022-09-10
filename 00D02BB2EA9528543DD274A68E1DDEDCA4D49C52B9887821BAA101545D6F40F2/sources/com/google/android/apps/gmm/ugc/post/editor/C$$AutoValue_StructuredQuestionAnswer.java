package com.google.android.apps.gmm.ugc.post.editor;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.ugc.post.editor.$$AutoValue_StructuredQuestionAnswer  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$$AutoValue_StructuredQuestionAnswer extends StructuredQuestionAnswer {
    public final dcgn<bvrt<drfq>, bvrt<drfq>> a;

    public C$$AutoValue_StructuredQuestionAnswer(dcgn<bvrt<drfq>, bvrt<drfq>> dcgnVar) {
        if (dcgnVar != null) {
            this.a = dcgnVar;
            return;
        }
        throw new NullPointerException("Null serializableAnswers");
    }

    @Override // com.google.android.apps.gmm.ugc.post.editor.StructuredQuestionAnswer
    public final dcgn<bvrt<drfq>, bvrt<drfq>> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StructuredQuestionAnswer)) {
            return false;
        }
        return dckz.f(this.a, ((StructuredQuestionAnswer) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("StructuredQuestionAnswer{serializableAnswers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
