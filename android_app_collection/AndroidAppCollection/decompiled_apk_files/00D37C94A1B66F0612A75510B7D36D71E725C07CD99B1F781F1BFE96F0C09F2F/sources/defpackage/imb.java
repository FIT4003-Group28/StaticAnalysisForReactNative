package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: imb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class imb implements ayqe {
    public final /* synthetic */ imp a;
    private final /* synthetic */ int b;

    public /* synthetic */ imb(imp impVar) {
        this.a = impVar;
    }

    public /* synthetic */ imb(imp impVar, int i) {
        this.b = i;
        this.a = impVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            imj imjVar = (imj) obj;
            return aynx.B(imjVar).j(this.a.e(imjVar));
        } else if (i == 1) {
            imj imjVar2 = (imj) obj;
            return aynx.B(imjVar2).j(this.a.e(imjVar2));
        } else if (i == 2) {
            return this.a.f((imj) obj);
        } else {
            if (i == 3) {
                Resources resources = this.a.g.getResources();
                int i2 = ((imk) obj).a;
                return resources.getQuantityString(R.plurals.upload_indicator_all_completed, i2, Integer.valueOf(i2));
            } else if (i == 4) {
                iml imlVar = (iml) obj;
                Resources resources2 = this.a.g.getResources();
                int i3 = imlVar.a;
                int i4 = imlVar.b;
                if (i3 != i4) {
                    return resources2.getQuantityString(R.plurals.upload_indicator_partial_fail, i4, Integer.valueOf(i3), Integer.valueOf(imlVar.b));
                }
                return resources2.getQuantityString(R.plurals.upload_indicator_all_failed, i3, Integer.valueOf(i3));
            } else {
                imn imnVar = (imn) obj;
                Resources resources3 = this.a.g.getResources();
                int i5 = imnVar.c;
                if (i5 == 0) {
                    int i6 = imnVar.b;
                    return resources3.getQuantityString(R.plurals.upload_indicator_all_uploading, i6, Integer.valueOf(i6));
                }
                Object[] objArr = {Integer.valueOf(i5)};
                int i7 = imnVar.b;
                return resources3.getString(R.string.upload_indicator_uploading_and_completed, resources3.getQuantityString(R.plurals.upload_indicator_uploading_and_completed_completed_part, i5, objArr), resources3.getQuantityString(R.plurals.upload_indicator_uploading_and_completed_uploading_part, i7, Integer.valueOf(i7)));
            }
        }
    }
}
