package defpackage;

import defpackage.aikz;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: aigz  reason: default package */
/* loaded from: classes2.dex */
public final class aigz<T extends aikz> implements ailb<T> {
    private final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    private final ConcurrentHashMap<dbsg<String>, T> b = new ConcurrentHashMap<>();
    private final Set<aila> c = new CopyOnWriteArraySet();
    private final Executor d;
    private final ajsj e;

    public aigz(Executor executor, ajsj ajsjVar) {
        this.d = executor;
        this.e = ajsjVar;
    }

    private static dbsg<String> f(dbsg<btlu> dbsgVar) {
        return (!dbsgVar.a() || !dbsgVar.b().l()) ? dbpy.a : dbsgVar.h(aigy.a);
    }

    public final void a(final dbsg<btlu> dbsgVar, T t) {
        if (this.e.f()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            this.b.put(f(dbsgVar), t);
            this.a.writeLock().unlock();
            for (final aila ailaVar : this.c) {
                this.d.execute(new Runnable(ailaVar, dbsgVar) { // from class: aigx
                    private final aila a;
                    private final dbsg b;

                    {
                        this.a = ailaVar;
                        this.b = dbsgVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(this.b);
                    }
                });
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.ailb
    public final dbsg<T> b(dbsg<btlu> dbsgVar) {
        if (this.e.f()) {
            return dbpy.a;
        }
        this.a.readLock().lock();
        try {
            T t = this.b.get(f(dbsgVar));
            this.a.readLock().unlock();
            return dbsg.j(t);
        } catch (Throwable th) {
            this.a.readLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.ailb
    public final void c(aila ailaVar) {
        this.c.add(ailaVar);
    }

    @Override // defpackage.ailb
    public final void d(aila ailaVar) {
        this.c.remove(ailaVar);
    }

    @Override // defpackage.ailb
    public final void e(String str, PrintWriter printWriter) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append("ModelManagerImpl #");
        sb.append(hexString);
        printWriter.println(sb.toString());
        this.a.readLock().lock();
        try {
            for (Map.Entry<dbsg<String>, T> entry : this.b.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(valueOf).length());
                sb2.append(str);
                sb2.append("  accountId=");
                sb2.append(valueOf);
                printWriter.println(sb2.toString());
                entry.getValue().c(String.valueOf(str).concat("    "), printWriter);
            }
        } finally {
            this.a.readLock().unlock();
        }
    }
}
