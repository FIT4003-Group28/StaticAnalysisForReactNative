package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: pop  reason: default package */
/* loaded from: classes4.dex */
public final class pop extends poo {
    @Override // defpackage.poo
    protected final Metadata b(pol polVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            pwt pwtVar = new pwt(byteBuffer.array(), byteBuffer.limit());
            pwtVar.l(12);
            int b = (pwtVar.b() + pwtVar.d(12)) - 4;
            pwtVar.l(44);
            pwtVar.m(pwtVar.d(12));
            pwtVar.l(16);
            ArrayList arrayList = new ArrayList();
            while (pwtVar.b() < b) {
                pwtVar.l(48);
                int d = pwtVar.d(8);
                pwtVar.l(4);
                int b2 = pwtVar.b() + pwtVar.d(12);
                String str = null;
                String str2 = null;
                while (pwtVar.b() < b2) {
                    int d2 = pwtVar.d(8);
                    int d3 = pwtVar.d(8);
                    int b3 = pwtVar.b() + d3;
                    if (d2 == 2) {
                        int d4 = pwtVar.d(16);
                        pwtVar.l(8);
                        if (d4 != 3) {
                        }
                        while (pwtVar.b() < b3) {
                            str = pwtVar.e(pwtVar.d(8), amoz.a);
                            int d5 = pwtVar.d(8);
                            for (int i = 0; i < d5; i++) {
                                pwtVar.m(pwtVar.d(8));
                            }
                        }
                    } else if (d2 == 21) {
                        str2 = pwtVar.e(d3, amoz.a);
                    }
                    pwtVar.j(b3 * 8);
                }
                pwtVar.j(b2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new AppInfoTable(d, str2.length() != 0 ? str.concat(str2) : new String(str)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new Metadata(arrayList);
            }
            return null;
        }
        return null;
    }
}
