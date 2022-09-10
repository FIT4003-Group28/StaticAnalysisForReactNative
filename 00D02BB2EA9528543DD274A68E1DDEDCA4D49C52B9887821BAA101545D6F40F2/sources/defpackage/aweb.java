package defpackage;
/* compiled from: PG */
/* renamed from: aweb  reason: default package */
/* loaded from: classes3.dex */
public final class aweb<T> extends btrh<T> {
    private final int d;

    public aweb(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            awea aweaVar = (awea) this.a;
            alje aljeVar = ((alhw) obj).a;
            if (aljeVar == alje.FIRST_FINGER_DOWN) {
                aweaVar.e = true;
            } else if (aljeVar != alje.LAST_FINGER_UP) {
            } else {
                aweaVar.e = false;
            }
        } else if (i != 1) {
            awea aweaVar2 = (awea) this.a;
            alhl alhlVar = (alhl) obj;
            if (aweaVar2.g) {
                return;
            }
            aweaVar2.c.n(aweaVar2.d.g().d(awea.b), new cjte(deaf.DRAG), awea.b);
            aweaVar2.g = true;
        } else {
            awea aweaVar3 = (awea) this.a;
            alhx alhxVar = (alhx) obj;
            if (aweaVar3.f) {
                return;
            }
            aweaVar3.c.n(aweaVar3.d.g().d(awea.a), new cjte(deaf.PINCH), awea.a);
            aweaVar3.f = true;
        }
    }

    public aweb(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = 0;
    }
}
