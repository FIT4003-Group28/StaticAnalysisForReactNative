package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
/* compiled from: PG */
/* renamed from: deoa  reason: default package */
/* loaded from: classes6.dex */
public final class deoa extends delp {
    static final String[] a = {"com.google.android.googlequicksearchbox", "com.google.android.gms"};
    final denz b;
    private final Context c;

    public deoa(Context context) {
        denu denuVar = new denu(context);
        this.c = context;
        this.b = new denz(denuVar);
    }

    private final cpcq<Void> d(MutateRequest mutateRequest) {
        boolean isEmpty;
        denz denzVar = this.b;
        deny denyVar = new deny(denzVar, mutateRequest);
        cpcx<Void> cpcxVar = denyVar.b.a;
        cpcxVar.n(denzVar, denzVar);
        synchronized (denzVar.b) {
            isEmpty = denzVar.b.isEmpty();
            denzVar.b.add(denyVar);
        }
        if (isEmpty) {
            denyVar.a();
        }
        return cpcxVar;
    }

    @Override // defpackage.delp
    public final cpcq<Void> a(deme... demeVarArr) {
        Context context;
        boolean z = true;
        try {
            Thing[] thingArr = new Thing[1];
            System.arraycopy(demeVarArr, 0, thingArr, 0, 1);
            if (dxzg.a.a().a() && (context = this.c) != null) {
                deon deonVar = deon.getInstance(context);
                Thing thing = thingArr[0];
                if (thing != null) {
                    Thing.Metadata metadata = thing.c;
                    boolean[] zArr = null;
                    String[] stringArray = !(metadata.d.get("sliceUri") instanceof String[]) ? null : metadata.d.getStringArray("sliceUri");
                    boolean z2 = stringArray != null && stringArray.length > 0;
                    Thing.Metadata metadata2 = thing.c;
                    if (metadata2.d.get("grantSlicePermission") instanceof boolean[]) {
                        zArr = metadata2.d.getBooleanArray("grantSlicePermission");
                    }
                    if (zArr == null || zArr.length <= 0 || !zArr[0]) {
                        z = false;
                    }
                    if (z2 && z) {
                        String str = stringArray[0];
                        String[] strArr = a;
                        for (int i = 0; i < 2; i++) {
                            try {
                                deonVar.a(strArr[i], Uri.parse(str));
                            } catch (Exception e) {
                                String valueOf = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                                sb.append("Error trying to grant permission to Slice Uris: ");
                                sb.append(valueOf);
                                sb.toString();
                            }
                        }
                    }
                }
            }
            return d(MutateRequest.newUpdate(thingArr));
        } catch (ArrayStoreException unused) {
            return cpda.b(new delt("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }

    @Override // defpackage.delp
    public final cpcq<Void> b(String... strArr) {
        return d(MutateRequest.newRemove(strArr));
    }

    @Override // defpackage.delp
    public final cpcq<Void> c(String... strArr) {
        return d(MutateRequest.newRemoveTypes(strArr));
    }
}
