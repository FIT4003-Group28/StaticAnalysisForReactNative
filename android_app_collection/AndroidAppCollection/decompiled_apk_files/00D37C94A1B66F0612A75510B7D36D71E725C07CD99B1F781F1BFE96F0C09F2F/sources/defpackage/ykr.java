package defpackage;

import android.os.ConditionVariable;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ykr  reason: default package */
/* loaded from: classes4.dex */
public abstract class ykr implements ykg {
    public static final /* synthetic */ int b = 0;
    private static final FilenameFilter c = afjv.a;
    public final ConditionVariable a;
    private final File d;
    private final Map e;
    private volatile boolean f;

    public ykr() {
        this.f = false;
        this.d = null;
        this.a = new ConditionVariable(false);
        this.e = amyc.b;
    }

    private final void f() {
        aqxo.z(this.f, "init() must be called before calling to this method");
        this.a.block();
    }

    public static ykr j(String str, ampg ampgVar) {
        if (amps.e(str)) {
            return ykq.f();
        }
        File file = new File(str);
        if (!file.isDirectory()) {
            try {
                file.mkdirs();
            } catch (Exception unused) {
            }
        }
        return (ykr) (!file.isDirectory() ? ykq.f() : ampgVar.apply(file));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void k(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void l(OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (IOException unused) {
        }
    }

    static final String m(Object obj) {
        int hashCode = obj.hashCode();
        StringBuilder sb = new StringBuilder(17);
        sb.append(hashCode);
        sb.append(".cache");
        return sb.toString();
    }

    @Override // defpackage.ykg
    public final Object a(Object obj) {
        Object obj2;
        BufferedInputStream bufferedInputStream;
        obj.getClass();
        BufferedInputStream bufferedInputStream2 = null;
        Object obj3 = null;
        BufferedInputStream bufferedInputStream3 = null;
        if (this.d == null) {
            return null;
        }
        f();
        String m = m(obj);
        File file = new File(this.d, m);
        try {
            if (!this.e.containsKey(m)) {
                return null;
            }
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            } catch (Exception unused) {
                obj2 = null;
            }
            try {
                obj3 = g(bufferedInputStream);
                file.setLastModified(System.currentTimeMillis());
                k(bufferedInputStream);
                return obj3;
            } catch (Exception unused2) {
                obj2 = obj3;
                bufferedInputStream3 = bufferedInputStream;
                this.e.remove(m);
                StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 53);
                sb.append("Error opening cache file (maybe removed). [filename=");
                sb.append(m);
                sb.append("]");
                zep.l(sb.toString());
                k(bufferedInputStream3);
                bufferedInputStream2 = obj2;
                return bufferedInputStream2;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream2 = bufferedInputStream;
                k(bufferedInputStream2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.ykg
    public final Object b(Object obj) {
        obj.getClass();
        if (this.d == null) {
            return null;
        }
        f();
        Object a = a(obj);
        if (a != null) {
            String m = m(obj);
            File file = new File(this.d, m);
            this.e.remove(m);
            file.delete();
        }
        return a;
    }

    @Override // defpackage.ykg
    public final void c() {
        throw null;
    }

    @Override // defpackage.ykg
    public final void d(Object obj, Object obj2) {
        BufferedOutputStream bufferedOutputStream;
        obj.getClass();
        if (this.d == null) {
            return;
        }
        f();
        String m = m(obj);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(this.d, m)), 8192);
            } catch (Throwable th) {
                th = th;
            }
            try {
                i(obj2, bufferedOutputStream);
                this.e.put(m, "");
                l(bufferedOutputStream);
            } catch (FileNotFoundException e) {
                e = e;
                bufferedOutputStream2 = bufferedOutputStream;
                zep.n("Error creating cache file.", e);
                l(bufferedOutputStream2);
            } catch (IOException e2) {
                e = e2;
                bufferedOutputStream2 = bufferedOutputStream;
                zep.n("Error creating cache file.", e);
                l(bufferedOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                l(bufferedOutputStream2);
                throw th;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
        } catch (IOException e4) {
            e = e4;
        }
    }

    @Override // defpackage.ykg
    public final boolean e(Object obj) {
        obj.getClass();
        return this.d != null && this.e.containsKey(m(obj));
    }

    protected abstract Object g(BufferedInputStream bufferedInputStream);

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        File[] listFiles = this.d.listFiles(c);
        if (listFiles != null) {
            for (File file : listFiles) {
                this.e.put(file.getName(), "");
            }
        }
    }

    protected abstract void i(Object obj, BufferedOutputStream bufferedOutputStream);

    public final void n(Executor executor) {
        this.f = true;
        executor.execute(new ykp(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ykr(File file) {
        this.f = false;
        aqxo.u(file.isDirectory(), "%s is not a directory", file.getAbsolutePath());
        this.d = file;
        this.a = new ConditionVariable(false);
        this.e = new ConcurrentHashMap();
    }
}
