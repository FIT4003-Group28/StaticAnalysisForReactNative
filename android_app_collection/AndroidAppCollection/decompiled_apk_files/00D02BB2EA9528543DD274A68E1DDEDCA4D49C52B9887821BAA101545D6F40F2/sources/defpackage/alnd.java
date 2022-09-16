package defpackage;

import android.view.KeyEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: alnd  reason: default package */
/* loaded from: classes.dex */
public final class alnd implements View.OnKeyListener {
    private int a = -1;
    private long b = 0;
    private final cqat c;
    private final akzz d;

    public alnd(akzz akzzVar, cqat cqatVar) {
        this.d = akzzVar;
        this.c = cqatVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        int i3 = 0;
        switch (keyEvent.getKeyCode()) {
            case 19:
            case 20:
            case 21:
            case 22:
                if (keyEvent.getAction() == 0) {
                    int i4 = 25;
                    if (this.a == keyEvent.getKeyCode() && this.c.e() - this.b < 250) {
                        i4 = 12;
                    }
                    switch (keyEvent.getKeyCode()) {
                        case 19:
                            i2 = -i4;
                            this.d.g(i3, i2);
                            this.a = keyEvent.getKeyCode();
                            this.b = this.c.e();
                            break;
                        case 20:
                            i2 = i4;
                            this.d.g(i3, i2);
                            this.a = keyEvent.getKeyCode();
                            this.b = this.c.e();
                            break;
                        case 21:
                            i3 = -i4;
                            i2 = 0;
                            this.d.g(i3, i2);
                            this.a = keyEvent.getKeyCode();
                            this.b = this.c.e();
                            break;
                        case 22:
                            i3 = i4;
                            i2 = 0;
                            this.d.g(i3, i2);
                            this.a = keyEvent.getKeyCode();
                            this.b = this.c.e();
                            break;
                        default:
                            this.a = keyEvent.getKeyCode();
                            this.b = this.c.e();
                            break;
                    }
                } else if (keyEvent.getAction() == 1 && this.a == keyEvent.getKeyCode()) {
                    this.a = -1;
                }
                return true;
            default:
                return false;
        }
    }
}
