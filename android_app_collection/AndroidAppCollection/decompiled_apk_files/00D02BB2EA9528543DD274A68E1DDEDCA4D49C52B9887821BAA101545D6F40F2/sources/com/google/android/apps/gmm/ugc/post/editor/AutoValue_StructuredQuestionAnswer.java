package com.google.android.apps.gmm.ugc.post.editor;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_StructuredQuestionAnswer extends C$AutoValue_StructuredQuestionAnswer {
    public static final Parcelable.Creator<AutoValue_StructuredQuestionAnswer> CREATOR = new cdjs();

    public AutoValue_StructuredQuestionAnswer(final dcgn<bvrt<drfq>, bvrt<drfq>> dcgnVar) {
        new C$$AutoValue_StructuredQuestionAnswer(dcgnVar) { // from class: com.google.android.apps.gmm.ugc.post.editor.$AutoValue_StructuredQuestionAnswer
            private volatile transient dcgn<drfq, drfq> b;

            @Override // com.google.android.apps.gmm.ugc.post.editor.StructuredQuestionAnswer
            public final dcgn<drfq, drfq> b() {
                if (this.b == null) {
                    synchronized (this) {
                        if (this.b == null) {
                            dcgn<drfq, drfq> O = dcgn.O();
                            for (Map.Entry<bvrt<drfq>, bvrt<drfq>> entry : a().I()) {
                                O.n(entry.getKey().e((dssr) drfq.a.cu(7), drfq.a), entry.getValue().e((dssr) drfq.a.cu(7), drfq.a));
                            }
                            this.b = O;
                            if (this.b == null) {
                                throw new NullPointerException("answers() cannot return null");
                            }
                        }
                    }
                }
                return this.b;
            }
        };
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
    }
}
