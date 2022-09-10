package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cnyx  reason: default package */
/* loaded from: classes5.dex */
final class cnyx implements cnph<cnzc> {
    final /* synthetic */ WriteBatchImpl a;
    final /* synthetic */ cnph b;

    public cnyx(WriteBatchImpl writeBatchImpl, cnph cnphVar) {
        this.a = writeBatchImpl;
        this.b = cnphVar;
    }

    @Override // defpackage.cnph
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        cnzc cnzcVar = (cnzc) obj;
        if (cnzcVar.a.d()) {
            WriteBatchImpl writeBatchImpl = this.a;
            WriteBatchImpl writeBatchImpl2 = cnzcVar.b;
            ArrayList<ContextData> arrayList = writeBatchImpl.a;
            if (arrayList != null) {
                ArrayList<ContextData> arrayList2 = writeBatchImpl2.a;
                int size = arrayList.size();
                cnty.a(size == arrayList2.size());
                for (int i = 0; i < size; i++) {
                    ContextData contextData = arrayList.get(i);
                    ContextData contextData2 = arrayList2.get(i);
                    cnty.a(contextData.equals(contextData2));
                    contextData.a = contextData2.a;
                    contextData.b = contextData2.b;
                    contextData.c = null;
                    contextData.b();
                }
            } else if (writeBatchImpl2.a != null) {
                throw new IllegalArgumentException("non-null reference");
            }
        }
        this.b.c(cnzcVar.a);
    }
}
