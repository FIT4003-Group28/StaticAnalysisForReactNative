package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnqk  reason: default package */
/* loaded from: classes.dex */
public final class cnqk extends cnqo {
    final /* synthetic */ cnqp a;
    private final ArrayList<cnnz> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnqk(cnqp cnqpVar, ArrayList<cnnz> arrayList) {
        super(cnqpVar);
        this.a = cnqpVar;
        this.c = arrayList;
    }

    @Override // defpackage.cnqo
    public final void a() {
        Set<Scope> set;
        cnqp cnqpVar = this.a;
        cnqx cnqxVar = cnqpVar.a.m;
        cnum cnumVar = cnqpVar.j;
        if (cnumVar == null) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(cnumVar.b);
            Map<Api<?>, cnul> map = cnqpVar.j.d;
            for (Api<?> api : map.keySet()) {
                if (!cnqpVar.a.g.containsKey(api.getClientKey())) {
                    hashSet.addAll(map.get(api).a);
                }
            }
            set = hashSet;
        }
        cnqxVar.g = set;
        ArrayList<cnnz> arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cnqp cnqpVar2 = this.a;
            arrayList.get(i).A(cnqpVar2.k, cnqpVar2.a.m.g);
        }
    }
}
