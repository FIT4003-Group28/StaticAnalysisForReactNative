package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cmcb  reason: default package */
/* loaded from: classes5.dex */
public final class cmcb extends cmbz {
    @Override // defpackage.cmbz
    protected final Metadata b(cmbw cmbwVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            cmnj cmnjVar = new cmnj(byteBuffer.array(), byteBuffer.limit());
            cmnjVar.h(12);
            int e = (cmnjVar.e() + cmnjVar.j(12)) - 4;
            cmnjVar.h(44);
            cmnjVar.l(cmnjVar.j(12));
            cmnjVar.h(16);
            ArrayList arrayList = new ArrayList();
            while (cmnjVar.e() < e) {
                cmnjVar.h(48);
                int j = cmnjVar.j(8);
                cmnjVar.h(4);
                int e2 = cmnjVar.e() + cmnjVar.j(12);
                String str = null;
                String str2 = null;
                while (cmnjVar.e() < e2) {
                    int j2 = cmnjVar.j(8);
                    int j3 = cmnjVar.j(8);
                    int e3 = cmnjVar.e() + j3;
                    if (j2 == 2) {
                        int j4 = cmnjVar.j(16);
                        cmnjVar.h(8);
                        if (j4 != 3) {
                        }
                        while (cmnjVar.e() < e3) {
                            str = cmnjVar.m(cmnjVar.j(8), dbrc.a);
                            int j5 = cmnjVar.j(8);
                            for (int i = 0; i < j5; i++) {
                                cmnjVar.l(cmnjVar.j(8));
                            }
                        }
                    } else if (j2 == 21) {
                        str2 = cmnjVar.m(j3, dbrc.a);
                    }
                    cmnjVar.f(e3 * 8);
                }
                cmnjVar.f(e2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new AppInfoTable(j, str2.length() != 0 ? str.concat(str2) : new String(str)));
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
