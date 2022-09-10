package defpackage;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cpid  reason: default package */
/* loaded from: classes5.dex */
public final class cpid extends cntp implements cpgl {
    private final int d;

    public cpid(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    @Override // defpackage.cpgl
    public final Uri a() {
        return Uri.parse(K("path"));
    }

    @Override // defpackage.cpgl
    public final byte[] b() {
        return L("data");
    }

    public final String toString() {
        byte[] b = b();
        HashMap hashMap = new HashMap(this.d);
        for (int i = 0; i < this.d; i++) {
            cpib cpibVar = new cpib(this.a, this.b + i);
            if (cpibVar.b() != null) {
                hashMap.put(cpibVar.b(), cpibVar);
            }
        }
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        String valueOf = String.valueOf(a());
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 4);
        sb2.append("uri=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        String valueOf2 = String.valueOf(b == null ? "null" : Integer.valueOf(b.length));
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 9);
        sb3.append(", dataSz=");
        sb3.append(valueOf2);
        sb.append(sb3.toString());
        int size = hashMap.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb.append(sb4.toString());
        sb.append(" }");
        return sb.toString();
    }
}
