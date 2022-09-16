package defpackage;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ard  reason: default package */
/* loaded from: classes2.dex */
final class ard extends arm {
    final /* synthetic */ arn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ard(Object obj, arn arnVar) {
        super(obj);
        this.a = arnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arm
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ArrayList arrayList;
        if (obj != 0) {
            arrayList = new ArrayList();
            Iterator it = obj.iterator();
            while (it.hasNext()) {
                Parcel obtain = Parcel.obtain();
                ((MediaBrowserCompat$MediaItem) it.next()).writeToParcel(obtain, 0);
                arrayList.add(obtain);
            }
        } else {
            arrayList = null;
        }
        this.a.a(arrayList);
    }
}
