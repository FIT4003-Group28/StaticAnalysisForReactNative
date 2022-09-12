package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bas  reason: default package */
/* loaded from: classes.dex */
public abstract class bas {
    private final DataSetObservable a = new DataSetObservable();
    private DataSetObserver b;

    public abstract int OV();

    public abstract boolean OW(View view, Object obj);

    public int OX(Object obj) {
        return -1;
    }

    public void OY(ViewGroup viewGroup) {
    }

    public Parcelable OZ() {
        return null;
    }

    public final void Pa() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public Object c(ViewGroup viewGroup, int i) {
        throw null;
    }

    public void d(ViewGroup viewGroup, int i, Object obj) {
        throw null;
    }

    public void e(ViewGroup viewGroup, int i, Object obj) {
    }

    public void f(ViewGroup viewGroup) {
    }

    public void j() {
    }

    public final void n(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public final void o(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }

    public final void p(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public CharSequence q(int i) {
        return null;
    }

    public float r(int i) {
        return 1.0f;
    }
}
