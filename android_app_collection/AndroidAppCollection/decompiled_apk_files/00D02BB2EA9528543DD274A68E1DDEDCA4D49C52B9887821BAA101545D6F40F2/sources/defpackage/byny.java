package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: byny  reason: default package */
/* loaded from: classes4.dex */
public class byny extends amtq<dozz> {
    public static final byny d = new byny(Collections.emptyList(), -1);

    public byny(List<dozz> list, int i) {
        super(list, i);
    }

    public static byny d(@dzsi Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("notice_in_list_list_key");
            if (parcelable instanceof ProtoBufUtil$ParcelableProtoList) {
                return new byny(((ProtoBufUtil$ParcelableProtoList) parcelable).a((dssr) dozz.y.cu(7)), bundle.getInt("notice_in_list_index_key", -1));
            }
        }
        return d;
    }
}
