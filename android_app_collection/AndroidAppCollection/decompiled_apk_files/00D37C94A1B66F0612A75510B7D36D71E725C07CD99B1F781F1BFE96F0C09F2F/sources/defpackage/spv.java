package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.LruCache;
import com.google.android.youtube.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: spv  reason: default package */
/* loaded from: classes4.dex */
public final class spv {
    private static final int c = ao.g("DEFAULT");
    public final LruCache a;
    public baqe b;
    private final LruCache d;
    private final Context e;
    private final Integer f = Integer.valueOf((int) R.raw.logs_proto_identity_boq_oauth_integrations_client_extension_collection_basis_library);

    public spv(Context context, LruCache lruCache, LruCache lruCache2) {
        this.e = context;
        this.d = lruCache;
        this.a = lruCache2;
    }

    private static Map e(List list, amuk amukVar) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() >= amukVar.size()) {
                throw new spu(String.format("CollectionBasisHolder index(%d) exceeds list size(%d)", num, Integer.valueOf(amukVar.size())));
            }
            bapy bapyVar = (bapy) amukVar.get(num.intValue());
            Integer valueOf = Integer.valueOf((bapyVar.c & 2) != 0 ? bapyVar.e : c);
            aopa mo52toBuilder = bapyVar.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            bapy bapyVar2 = (bapy) mo52toBuilder.instance;
            bapyVar2.c &= -3;
            bapyVar2.e = 0;
            hashMap.put(valueOf, (bapy) mo52toBuilder.mo39build());
        }
        return hashMap;
    }

    public final baqb a(int i) {
        LruCache lruCache = this.d;
        Integer valueOf = Integer.valueOf(i);
        baqb baqbVar = (baqb) lruCache.get(valueOf);
        if (baqbVar == null) {
            if (this.b == null) {
                this.b = c();
            }
            baqbVar = (baqb) Collections.unmodifiableMap(this.b.b).get(valueOf);
            if (baqbVar != null) {
                this.d.put(valueOf, baqbVar);
            }
        }
        return baqbVar;
    }

    public final baqb b(int i) {
        baqb a = a(i);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException();
    }

    public final baqe c() {
        bapx bapxVar;
        Context context = this.e;
        if (context != null) {
            try {
                InputStream openRawResource = context.getResources().openRawResource(this.f.intValue());
                aoog M = aoog.M(openRawResource);
                aopa createBuilder = baqe.a.createBuilder();
                createBuilder.mo45mergeFrom(M, aoos.a());
                baqe baqeVar = (baqe) createBuilder.mo39build();
                aopu aopuVar = baqeVar.d;
                aopq aopqVar = baqeVar.e;
                if (aopuVar.size() != aopqVar.size()) {
                    throw new spu(String.format("ProtoHashNamesList[%d] and MessagesList[%d] must have same size", Integer.valueOf(aopqVar.size()), Integer.valueOf(aopuVar.size())));
                }
                HashMap hashMap = new HashMap();
                amuk o = amuk.o(baqeVar.f);
                Iterator it = aopqVar.iterator();
                Iterator it2 = aopuVar.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Integer num = (Integer) it.next();
                    baqb baqbVar = (baqb) it2.next();
                    Map e = e(baqbVar.f, o);
                    aopq aopqVar2 = baqbVar.g;
                    aopt aoptVar = baqbVar.h;
                    if (aopqVar2.size() != aoptVar.size()) {
                        throw new spu(String.format("TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size", Integer.valueOf(aoptVar.size()), Integer.valueOf(aopqVar2.size())));
                    }
                    HashMap hashMap2 = new HashMap();
                    Iterator it3 = aopqVar2.iterator();
                    Iterator it4 = aoptVar.iterator();
                    while (it4.hasNext() && it3.hasNext()) {
                        Map e2 = e(amuk.r((Integer) it3.next()), o);
                        aopa createBuilder2 = bapx.a.createBuilder();
                        createBuilder2.cd(e2);
                        hashMap2.put((Long) it4.next(), (bapx) createBuilder2.mo39build());
                    }
                    aopu aopuVar2 = baqbVar.d;
                    aopt aoptVar2 = baqbVar.e;
                    if (aopuVar2.size() != aoptVar2.size()) {
                        throw new spu(String.format("TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size", Integer.valueOf(aoptVar2.size()), Integer.valueOf(aopuVar2.size())));
                    }
                    Iterator it5 = aoptVar2.iterator();
                    Iterator it6 = aopuVar2.iterator();
                    while (it5.hasNext() && it6.hasNext()) {
                        Long l = (Long) it5.next();
                        bapx bapxVar2 = (bapx) it6.next();
                        Map e3 = e(bapxVar2.e, o);
                        if (hashMap2.containsKey(l)) {
                            aopa mo52toBuilder = bapxVar2.mo52toBuilder();
                            mo52toBuilder.mergeFrom((aopi) ((bapx) hashMap2.get(l)));
                            bapxVar = (bapx) mo52toBuilder.mo39build();
                        } else {
                            aopa mo52toBuilder2 = bapxVar2.mo52toBuilder();
                            mo52toBuilder2.cd(e3);
                            mo52toBuilder2.copyOnWrite();
                            ((bapx) mo52toBuilder2.instance).e = bapx.emptyIntList();
                            bapxVar = (bapx) mo52toBuilder2.mo39build();
                        }
                        hashMap2.put(l, bapxVar);
                    }
                    aopa mo52toBuilder3 = baqbVar.mo52toBuilder();
                    mo52toBuilder3.copyOnWrite();
                    baqb baqbVar2 = (baqb) mo52toBuilder3.instance;
                    aoqp aoqpVar = baqbVar2.b;
                    if (!aoqpVar.b) {
                        baqbVar2.b = aoqpVar.a();
                    }
                    baqbVar2.b.putAll(e);
                    mo52toBuilder3.copyOnWrite();
                    ((baqb) mo52toBuilder3.instance).f = baqb.emptyIntList();
                    mo52toBuilder3.copyOnWrite();
                    baqb baqbVar3 = (baqb) mo52toBuilder3.instance;
                    aoqp aoqpVar2 = baqbVar3.c;
                    if (!aoqpVar2.b) {
                        baqbVar3.c = aoqpVar2.a();
                    }
                    baqbVar3.c.putAll(hashMap2);
                    mo52toBuilder3.copyOnWrite();
                    ((baqb) mo52toBuilder3.instance).e = baqb.emptyLongList();
                    mo52toBuilder3.copyOnWrite();
                    ((baqb) mo52toBuilder3.instance).d = baqb.emptyProtobufList();
                    mo52toBuilder3.copyOnWrite();
                    ((baqb) mo52toBuilder3.instance).g = baqb.emptyIntList();
                    mo52toBuilder3.copyOnWrite();
                    ((baqb) mo52toBuilder3.instance).h = baqb.emptyLongList();
                    hashMap.put(num, (baqb) mo52toBuilder3.mo39build());
                }
                aopa createBuilder3 = baqe.a.createBuilder();
                createBuilder3.copyOnWrite();
                baqe baqeVar2 = (baqe) createBuilder3.instance;
                aoqp aoqpVar3 = baqeVar2.b;
                if (!aoqpVar3.b) {
                    baqeVar2.b = aoqpVar3.a();
                }
                baqeVar2.b.putAll(hashMap);
                Map unmodifiableMap = Collections.unmodifiableMap(baqeVar.c);
                createBuilder3.copyOnWrite();
                baqe baqeVar3 = (baqe) createBuilder3.instance;
                aoqp aoqpVar4 = baqeVar3.c;
                if (!aoqpVar4.b) {
                    baqeVar3.c = aoqpVar4.a();
                }
                baqeVar3.c.putAll(unmodifiableMap);
                baqe baqeVar4 = (baqe) createBuilder3.mo39build();
                if (openRawResource != null) {
                    openRawResource.close();
                }
                return baqeVar4;
            } catch (Resources.NotFoundException e4) {
                throw new IOException(e4);
            }
        }
        throw new IOException("No context to load resource from");
    }

    public final boolean d(int i) {
        return a(i) != null;
    }
}
