package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aqw  reason: default package */
/* loaded from: classes2.dex */
final class aqw extends arm {
    final /* synthetic */ ara a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ arx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqw(arx arxVar, Object obj, ara araVar, String str, Bundle bundle) {
        super(obj);
        this.d = arxVar;
        this.a = araVar;
        this.b = str;
        this.c = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arm
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.d.c.get(this.a.f.a()) != this.a) {
            return;
        }
        List list = obj;
        if ((this.h & 1) != 0) {
            list = arx.a(obj, this.c);
        }
        try {
            arv arvVar = this.a.f;
            String str = this.b;
            Bundle bundle = this.c;
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            bundle2.putBundle("data_notify_children_changed_options", null);
            if (list != null) {
                bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? list : new ArrayList<>(list));
            }
            arvVar.b(3, bundle2);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.b + " package=" + this.a.a);
        }
    }
}
