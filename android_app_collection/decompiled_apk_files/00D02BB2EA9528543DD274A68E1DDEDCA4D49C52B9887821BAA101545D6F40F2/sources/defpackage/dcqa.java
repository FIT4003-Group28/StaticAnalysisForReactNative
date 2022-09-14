package defpackage;

import defpackage.dcpz;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dcqa  reason: default package */
/* loaded from: classes.dex */
public abstract class dcqa<LOGGER extends dcpz<API>, API> extends dcqm<LOGGER, API> implements dcqw<API> {
    /* JADX INFO: Access modifiers changed from: protected */
    public dcqa(Level level, boolean z) {
        super(level, z);
    }

    @Override // defpackage.dcqm
    protected final dcuf a() {
        return dcud.a;
    }

    @Override // defpackage.dcqm
    protected final boolean b(dcqq dcqqVar) {
        int d;
        int i;
        dcqu putIfAbsent;
        dcrp l = l();
        int a = l.a();
        int i2 = 0;
        while (true) {
            if (i2 >= a) {
                break;
            } else if (l.b(i2).a != "eye3tag") {
                i2++;
            } else if (l.e(dcqj.a) == null && l.e(dcqj.g) == null) {
                m(dcqj.g, dcqz.SMALL);
            }
        }
        dcqk dcqkVar = this.c;
        if (dcqkVar != null && dcqqVar != null) {
            Integer num = (Integer) dcqkVar.e(dcqj.b);
            dcqs dcqsVar = (dcqs) this.c.e(dcqj.c);
            dcqt dcqtVar = dcqu.a;
            dcqu dcquVar = dcqtVar.a.get(dcqqVar);
            if (dcquVar == null && (putIfAbsent = dcqtVar.a.putIfAbsent(dcqqVar, (dcquVar = new dcqu()))) != null) {
                dcquVar = putIfAbsent;
            }
            if (num != null) {
                if (dcquVar.b.getAndIncrement() % num.intValue() != 0) {
                    return false;
                }
            }
            if (dcqsVar != null) {
                dcquVar.c.get();
                throw null;
            }
        }
        dcqz dcqzVar = (dcqz) l().e(dcqj.g);
        if (dcqzVar != null) {
            dcqy<dcqz> dcqyVar = dcqj.g;
            dcqk dcqkVar2 = this.c;
            if (dcqkVar2 != null && (d = dcqkVar2.d(dcqyVar)) >= 0) {
                int i3 = d + d;
                int i4 = i3 + 2;
                while (true) {
                    i = dcqkVar2.b;
                    if (i4 >= i + i) {
                        break;
                    }
                    Object obj = dcqkVar2.a[i4];
                    if (!obj.equals(dcqyVar)) {
                        Object[] objArr = dcqkVar2.a;
                        objArr[i3] = obj;
                        objArr[i3 + 1] = objArr[i4 + 1];
                        i3 += 2;
                    }
                    i4 += 2;
                }
                dcqkVar2.b = i - ((i4 - i3) >> 1);
                while (i3 < i4) {
                    dcqkVar2.a[i3] = null;
                    i3++;
                }
            }
            m(dcqj.a, new dcqr((Throwable) l().e(dcqj.a), dcqzVar, dcui.b(dcqm.class, new Throwable(), dcqzVar.f)));
        }
        return true;
    }
}
