package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: aifd  reason: default package */
/* loaded from: classes.dex */
final class aifd implements aies {
    private final int a;
    private final Set b = new CopyOnWriteArraySet();

    public aifd(int i) {
        this.a = i;
    }

    @Override // defpackage.aies
    public final void a(int i, int i2, int i3) {
        if (this.a != i) {
            return;
        }
        for (ymy ymyVar : this.b) {
            ymyVar.pk(i2, i3);
        }
    }

    @Override // defpackage.aies
    public final void c(int i, int i2) {
        if (this.a != i) {
            return;
        }
        for (ymy ymyVar : this.b) {
            ymyVar.d(0, i2);
        }
    }

    @Override // defpackage.aies
    public final void b(int i) {
        int i2 = this.a;
        if (i2 == 1) {
            for (ymy ymyVar : this.b) {
                ymyVar.d(0, 1);
            }
        } else if (i2 == 0) {
            for (ymy ymyVar2 : this.b) {
                ymyVar2.pk(i, 1);
            }
        }
    }
}
