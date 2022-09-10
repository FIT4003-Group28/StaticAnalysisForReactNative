package com.google.android.apps.gmm.ugc.post.editor;

import android.os.Parcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class StructuredQuestionAnswer implements Parcelable {
    public static StructuredQuestionAnswer c(List<drfo> list) {
        drff drffVar;
        dsrj<drfj> dsrjVar;
        dcgn O = dcgn.O();
        for (drfo drfoVar : list) {
            int i = drfoVar.a;
            if (i == 3) {
                dsrjVar = ((drfl) drfoVar.b).a;
            } else {
                if (i == 4) {
                    drffVar = (drff) drfoVar.b;
                } else {
                    drffVar = drff.b;
                }
                dsrjVar = drffVar.a;
            }
            dcdc z = dcbg.b(dsrjVar).o(cdnx.a).s(cdny.a).z();
            int size = z.size();
            for (int i2 = 0; i2 < size; i2++) {
                drfq drfqVar = (drfq) z.get(i2);
                drfq drfqVar2 = drfoVar.c;
                if (drfqVar2 == null) {
                    drfqVar2 = drfq.a;
                }
                O.n(bvrt.b(drfqVar2), bvrt.b(drfqVar));
            }
        }
        return new AutoValue_StructuredQuestionAnswer(O);
    }

    public abstract dcgn<bvrt<drfq>, bvrt<drfq>> a();

    public dcgn<drfq, drfq> b() {
        throw null;
    }
}
