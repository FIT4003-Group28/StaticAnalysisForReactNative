package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
/* renamed from: clhd  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class clhd implements clhr {
    static final clhr a = new clhd();

    private clhd() {
    }

    @Override // defpackage.clhr
    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        return bArr;
    }
}
