package academy.learn.piano;

import android.app.Application;
import android.content.Context;
import com.facebook.react.g;
import com.facebook.react.p;
import com.facebook.react.r;
import com.facebook.react.u;
import com.facebook.react.v;
import com.facebook.soloader.SoLoader;
import java.util.List;
/* loaded from: classes.dex */
public class MainApplication extends Application implements p {

    /* renamed from: b  reason: collision with root package name */
    private final u f822b = new a(this, this);

    /* loaded from: classes.dex */
    class a extends u {
        a(MainApplication mainApplication, Application application) {
            super(application);
        }

        @Override // com.facebook.react.u
        protected String e() {
            return "index";
        }

        @Override // com.facebook.react.u
        protected List<v> g() {
            return new g(this).a();
        }

        @Override // com.facebook.react.u
        public boolean k() {
            return false;
        }
    }

    private static void a(Context context, r rVar) {
    }

    @Override // com.facebook.react.p
    public u a() {
        return this.f822b;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        SoLoader.a((Context) this, false);
        a(this, a().h());
    }
}
