package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cntv  reason: default package */
/* loaded from: classes5.dex */
public abstract class cntv<T> extends cntl<T> {
    private boolean b;
    private ArrayList<Integer> c;

    /* JADX INFO: Access modifiers changed from: protected */
    public cntv(DataHolder dataHolder) {
        super(dataHolder);
        this.b = false;
    }

    private final void a() {
        synchronized (this) {
            if (!this.b) {
                DataHolder dataHolder = this.a;
                cnwc.a(dataHolder);
                int i = dataHolder.h;
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.c = arrayList;
                if (i > 0) {
                    arrayList.add(0);
                    String f = f();
                    String c = this.a.c(f, 0, this.a.e(0));
                    for (int i2 = 1; i2 < i; i2++) {
                        int e = this.a.e(i2);
                        String c2 = this.a.c(f, i2, e);
                        if (c2 != null) {
                            if (!c2.equals(c)) {
                                this.c.add(Integer.valueOf(i2));
                                c = c2;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(f);
                            sb.append(", at row: ");
                            sb.append(i2);
                            sb.append(", for window: ");
                            sb.append(e);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.b = true;
            }
        }
    }

    @Override // defpackage.cntl, defpackage.cntn
    public final int c() {
        a();
        return this.c.size();
    }

    @Override // defpackage.cntn
    public final T d(int i) {
        int intValue;
        int intValue2;
        a();
        int g = g(i);
        int i2 = 0;
        if (i >= 0 && i != this.c.size()) {
            if (i == this.c.size() - 1) {
                DataHolder dataHolder = this.a;
                cnwc.a(dataHolder);
                intValue = dataHolder.h;
                intValue2 = this.c.get(i).intValue();
            } else {
                intValue = this.c.get(i + 1).intValue();
                intValue2 = this.c.get(i).intValue();
            }
            i2 = intValue - intValue2;
            if (i2 == 1) {
                int g2 = g(i);
                DataHolder dataHolder2 = this.a;
                cnwc.a(dataHolder2);
                dataHolder2.e(g2);
                i2 = 1;
            }
        }
        return e(g, i2);
    }

    protected abstract T e(int i, int i2);

    protected abstract String f();

    final int g(int i) {
        if (i < 0 || i >= this.c.size()) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is out of bounds for this buffer");
            throw new IllegalArgumentException(sb.toString());
        }
        return this.c.get(i).intValue();
    }
}
