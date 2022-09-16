package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.List;
/* compiled from: PG */
/* renamed from: aijm  reason: default package */
/* loaded from: classes2.dex */
final class aijm extends aijo {
    private final int c;

    public aijm(long j, PersonId personId, int i) {
        super(personId, j);
        this.c = i;
    }

    @Override // defpackage.aijo
    public final void a(List<dqzv> list) {
        int i = 0;
        while (i < list.size()) {
            int a = dqzq.a(list.get(i).d);
            if (a == 0) {
                a = 1;
            }
            int i2 = this.c;
            if (a == i2 || i2 == 1) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }
}
