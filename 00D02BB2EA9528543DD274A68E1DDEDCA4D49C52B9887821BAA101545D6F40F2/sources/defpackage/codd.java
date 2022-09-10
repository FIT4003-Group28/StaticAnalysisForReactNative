package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.feedback.FeedbackOptions;
import java.util.List;
/* compiled from: PG */
/* renamed from: codd  reason: default package */
/* loaded from: classes5.dex */
public final class codd {
    public static Bundle a(List<Pair<String, String>> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair<String, String> pair = list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    public static void b(FeedbackOptions feedbackOptions) {
        if (!codf.c.a().booleanValue() || feedbackOptions == null) {
            return;
        }
        Parcel obtain = Parcel.obtain();
        cocx.a(feedbackOptions, obtain, 0);
        int dataSize = obtain.dataSize();
        obtain.recycle();
        if (dataSize <= codf.b.a().intValue()) {
            return;
        }
        String valueOf = String.valueOf(codf.b.a());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 104);
        sb.append("Max allowed feedback options size of ");
        sb.append(valueOf);
        sb.append(" exceeded, you are passing in feedback options of ");
        sb.append(dataSize);
        sb.append(" size.");
        throw new IllegalStateException(sb.toString());
    }
}
