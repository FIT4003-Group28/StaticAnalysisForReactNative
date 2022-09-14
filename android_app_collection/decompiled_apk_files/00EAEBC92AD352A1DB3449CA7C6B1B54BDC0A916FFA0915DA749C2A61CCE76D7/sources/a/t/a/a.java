package a.t.a;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final DataSetObservable f794a = new DataSetObservable();

    /* renamed from: b  reason: collision with root package name */
    private DataSetObserver f795b;

    public float a(int i) {
        return 1.0f;
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract Object a(ViewGroup viewGroup, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f795b = dataSetObserver;
        }
    }

    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    public void a(View view) {
    }

    @Deprecated
    public void a(View view, int i, Object obj) {
    }

    public void a(ViewGroup viewGroup) {
        a((View) viewGroup);
    }

    public abstract void a(ViewGroup viewGroup, int i, Object obj);

    public abstract boolean a(View view, Object obj);

    public void b() {
        synchronized (this) {
            if (this.f795b != null) {
                this.f795b.onChanged();
            }
        }
        this.f794a.notifyChanged();
    }

    @Deprecated
    public void b(View view) {
    }

    public void b(ViewGroup viewGroup) {
        b((View) viewGroup);
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        a((View) viewGroup, i, obj);
    }

    public Parcelable c() {
        return null;
    }
}
