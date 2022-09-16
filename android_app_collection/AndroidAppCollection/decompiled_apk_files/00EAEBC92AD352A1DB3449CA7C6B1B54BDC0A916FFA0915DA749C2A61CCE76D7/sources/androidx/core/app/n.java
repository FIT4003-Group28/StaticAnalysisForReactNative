package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class n implements Iterable<Intent> {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Intent> f1564b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Context f1565c;

    /* loaded from: classes.dex */
    public interface a {
        Intent f();
    }

    private n(Context context) {
        this.f1565c = context;
    }

    public static n a(Context context) {
        return new n(context);
    }

    public n a(Activity activity) {
        Intent f2 = activity instanceof a ? ((a) activity).f() : null;
        if (f2 == null) {
            f2 = e.a(activity);
        }
        if (f2 != null) {
            ComponentName component = f2.getComponent();
            if (component == null) {
                component = f2.resolveActivity(this.f1565c.getPackageManager());
            }
            a(component);
            a(f2);
        }
        return this;
    }

    public n a(ComponentName componentName) {
        int size = this.f1564b.size();
        try {
            Context context = this.f1565c;
            while (true) {
                Intent a2 = e.a(context, componentName);
                if (a2 == null) {
                    return this;
                }
                this.f1564b.add(size, a2);
                context = this.f1565c;
                componentName = a2.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public n a(Intent intent) {
        this.f1564b.add(intent);
        return this;
    }

    public void a() {
        a((Bundle) null);
    }

    public void a(Bundle bundle) {
        if (!this.f1564b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1564b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (a.g.e.b.a(this.f1565c, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f1565c.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1564b.iterator();
    }
}
