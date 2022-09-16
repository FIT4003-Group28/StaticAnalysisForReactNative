package com.google.protos.youtube.api.innertube;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LiveChatAction {
    public static final aopg replaceLiveChatRendererAction = aopi.newSingularGeneratedExtension(apzg.a, asqa.a, asqa.a, null, 167912809, aosj.MESSAGE, asqa.class);
    public static final aopg showLiveChatSurveyCommand = aopi.newSingularGeneratedExtension(apzg.a, asqb.a, asqb.a, null, 181233165, aosj.MESSAGE, asqb.class);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class AddChatItemAction extends aopi implements aoqv {
        public static final AddChatItemAction a;
        public static final aopg addChatItemAction;
        private static volatile aorb f;
        public int b;
        public asqy c;
        public aspz e;
        private byte g = 2;
        public String d = "";

        static {
            AddChatItemAction addChatItemAction2 = new AddChatItemAction();
            a = addChatItemAction2;
            aopi.registerDefaultInstance(AddChatItemAction.class, addChatItemAction2);
            addChatItemAction = aopi.newSingularGeneratedExtension(apzg.a, addChatItemAction2, addChatItemAction2, null, 117298952, aosj.MESSAGE, AddChatItemAction.class);
        }

        private AddChatItemAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            byte b = 1;
            switch (aophVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.g);
                case 1:
                    if (obj == null) {
                        b = 0;
                    }
                    this.g = b;
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
                case 3:
                    return new AddChatItemAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = f;
                    if (aorbVar == null) {
                        synchronized (AddChatItemAction.class) {
                            aorbVar = f;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                f = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class AddLiveChatTextMessageFromTemplateAction extends aopi implements aoqv {
        public static final AddLiveChatTextMessageFromTemplateAction a;
        public static final aopg addLiveChatTextMessageFromTemplateAction;
        private static volatile aorb e;
        public int b;
        public aspy c;
        public aspz d;
        private byte f = 2;

        static {
            AddLiveChatTextMessageFromTemplateAction addLiveChatTextMessageFromTemplateAction2 = new AddLiveChatTextMessageFromTemplateAction();
            a = addLiveChatTextMessageFromTemplateAction2;
            aopi.registerDefaultInstance(AddLiveChatTextMessageFromTemplateAction.class, addLiveChatTextMessageFromTemplateAction2);
            addLiveChatTextMessageFromTemplateAction = aopi.newSingularGeneratedExtension(apzg.a, addLiveChatTextMessageFromTemplateAction2, addLiveChatTextMessageFromTemplateAction2, null, 126084307, aosj.MESSAGE, AddLiveChatTextMessageFromTemplateAction.class);
        }

        private AddLiveChatTextMessageFromTemplateAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            byte b = 1;
            switch (aophVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.f);
                case 1:
                    if (obj == null) {
                        b = 0;
                    }
                    this.f = b;
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
                case 3:
                    return new AddLiveChatTextMessageFromTemplateAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = e;
                    if (aorbVar == null) {
                        synchronized (AddLiveChatTextMessageFromTemplateAction.class) {
                            aorbVar = e;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                e = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class AddLiveChatTickerItemAction extends aopi implements aoqv {
        public static final AddLiveChatTickerItemAction a;
        public static final aopg addLiveChatTickerItemAction;
        private static volatile aorb e;
        public int b;
        public asta c;
        public long d;
        private byte f = 2;

        static {
            AddLiveChatTickerItemAction addLiveChatTickerItemAction2 = new AddLiveChatTickerItemAction();
            a = addLiveChatTickerItemAction2;
            aopi.registerDefaultInstance(AddLiveChatTickerItemAction.class, addLiveChatTickerItemAction2);
            addLiveChatTickerItemAction = aopi.newSingularGeneratedExtension(apzg.a, addLiveChatTickerItemAction2, addLiveChatTickerItemAction2, null, 132845915, aosj.MESSAGE, AddLiveChatTickerItemAction.class);
        }

        private AddLiveChatTickerItemAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            byte b = 1;
            switch (aophVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.f);
                case 1:
                    if (obj == null) {
                        b = 0;
                    }
                    this.f = b;
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
                case 3:
                    return new AddLiveChatTickerItemAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = e;
                    if (aorbVar == null) {
                        synchronized (AddLiveChatTickerItemAction.class) {
                            aorbVar = e;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                e = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class CancelVoteAction extends aopi implements aoqv {
        public static final CancelVoteAction a;
        private static volatile aorb b;
        public static final aopg cancelVoteAction;

        static {
            CancelVoteAction cancelVoteAction2 = new CancelVoteAction();
            a = cancelVoteAction2;
            aopi.registerDefaultInstance(CancelVoteAction.class, cancelVoteAction2);
            cancelVoteAction = aopi.newSingularGeneratedExtension(apzg.a, cancelVoteAction2, cancelVoteAction2, null, 238715030, aosj.MESSAGE, CancelVoteAction.class);
        }

        private CancelVoteAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            switch (aophVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0000", null);
                case 3:
                    return new CancelVoteAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = b;
                    if (aorbVar == null) {
                        synchronized (CancelVoteAction.class) {
                            aorbVar = b;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                b = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class CloseLiveChatActionPanelAction extends aopi implements aoqv {
        public static final CloseLiveChatActionPanelAction a;
        public static final aopg closeLiveChatActionPanelAction;
        private static volatile aorb f;
        public int b;
        public String c = "";
        public int d;
        public boolean e;

        static {
            CloseLiveChatActionPanelAction closeLiveChatActionPanelAction2 = new CloseLiveChatActionPanelAction();
            a = closeLiveChatActionPanelAction2;
            aopi.registerDefaultInstance(CloseLiveChatActionPanelAction.class, closeLiveChatActionPanelAction2);
            closeLiveChatActionPanelAction = aopi.newSingularGeneratedExtension(apzg.a, closeLiveChatActionPanelAction2, closeLiveChatActionPanelAction2, null, 240912718, aosj.MESSAGE, CloseLiveChatActionPanelAction.class);
        }

        private CloseLiveChatActionPanelAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            switch (aophVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003င\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e"});
                case 3:
                    return new CloseLiveChatActionPanelAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = f;
                    if (aorbVar == null) {
                        synchronized (CloseLiveChatActionPanelAction.class) {
                            aorbVar = f;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                f = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class DimChatItemAction extends aopi implements aoqv {
        public static final DimChatItemAction a;
        private static volatile aorb c;
        public static final aopg dimChatItemAction;
        public String b = "";
        private int d;

        static {
            DimChatItemAction dimChatItemAction2 = new DimChatItemAction();
            a = dimChatItemAction2;
            aopi.registerDefaultInstance(DimChatItemAction.class, dimChatItemAction2);
            dimChatItemAction = aopi.newSingularGeneratedExtension(apzg.a, dimChatItemAction2, dimChatItemAction2, null, 136048375, aosj.MESSAGE, DimChatItemAction.class);
        }

        private DimChatItemAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            switch (aophVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
                case 3:
                    return new DimChatItemAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = c;
                    if (aorbVar == null) {
                        synchronized (DimChatItemAction.class) {
                            aorbVar = c;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                c = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class ForceLiveChatContinuationCommand extends aopi implements aoqv {
        public static final ForceLiveChatContinuationCommand a;
        private static volatile aorb d;
        public static final aopg forceLiveChatContinuationCommand;
        public boolean b;
        public boolean c;
        private int e;

        static {
            ForceLiveChatContinuationCommand forceLiveChatContinuationCommand2 = new ForceLiveChatContinuationCommand();
            a = forceLiveChatContinuationCommand2;
            aopi.registerDefaultInstance(ForceLiveChatContinuationCommand.class, forceLiveChatContinuationCommand2);
            forceLiveChatContinuationCommand = aopi.newSingularGeneratedExtension(apzg.a, forceLiveChatContinuationCommand2, forceLiveChatContinuationCommand2, null, 220358198, aosj.MESSAGE, ForceLiveChatContinuationCommand.class);
        }

        private ForceLiveChatContinuationCommand() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            switch (aophVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"e", "b", "c"});
                case 3:
                    return new ForceLiveChatContinuationCommand();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = d;
                    if (aorbVar == null) {
                        synchronized (ForceLiveChatContinuationCommand.class) {
                            aorbVar = d;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                d = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class MarkChatItemAsDeletedAction extends aopi implements aoqv {
        public static final MarkChatItemAsDeletedAction a;
        private static volatile aorb f;
        public static final aopg markChatItemAsDeletedAction;
        public int b;
        public arag c;
        public arag d;
        private byte g = 2;
        public String e = "";

        static {
            MarkChatItemAsDeletedAction markChatItemAsDeletedAction2 = new MarkChatItemAsDeletedAction();
            a = markChatItemAsDeletedAction2;
            aopi.registerDefaultInstance(MarkChatItemAsDeletedAction.class, markChatItemAsDeletedAction2);
            markChatItemAsDeletedAction = aopi.newSingularGeneratedExtension(apzg.a, markChatItemAsDeletedAction2, markChatItemAsDeletedAction2, null, 135377179, aosj.MESSAGE, MarkChatItemAsDeletedAction.class);
        }

        private MarkChatItemAsDeletedAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            byte b = 1;
            switch (aophVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.g);
                case 1:
                    if (obj == null) {
                        b = 0;
                    }
                    this.g = b;
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0002\u0003ᐉ\u0001", new Object[]{"b", "c", "e", "d"});
                case 3:
                    return new MarkChatItemAsDeletedAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = f;
                    if (aorbVar == null) {
                        synchronized (MarkChatItemAsDeletedAction.class) {
                            aorbVar = f;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                f = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class MarkChatItemsByAuthorAsDeletedAction extends aopi implements aoqv {
        public static final MarkChatItemsByAuthorAsDeletedAction a;
        private static volatile aorb f;
        public static final aopg markChatItemsByAuthorAsDeletedAction;
        public int b;
        public arag c;
        public arag d;
        private byte g = 2;
        public String e = "";

        static {
            MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction2 = new MarkChatItemsByAuthorAsDeletedAction();
            a = markChatItemsByAuthorAsDeletedAction2;
            aopi.registerDefaultInstance(MarkChatItemsByAuthorAsDeletedAction.class, markChatItemsByAuthorAsDeletedAction2);
            markChatItemsByAuthorAsDeletedAction = aopi.newSingularGeneratedExtension(apzg.a, markChatItemsByAuthorAsDeletedAction2, markChatItemsByAuthorAsDeletedAction2, null, 133968669, aosj.MESSAGE, MarkChatItemsByAuthorAsDeletedAction.class);
        }

        private MarkChatItemsByAuthorAsDeletedAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            byte b = 1;
            switch (aophVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.g);
                case 1:
                    if (obj == null) {
                        b = 0;
                    }
                    this.g = b;
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0002\u0003ᐉ\u0001", new Object[]{"b", "c", "e", "d"});
                case 3:
                    return new MarkChatItemsByAuthorAsDeletedAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = f;
                    if (aorbVar == null) {
                        synchronized (MarkChatItemsByAuthorAsDeletedAction.class) {
                            aorbVar = f;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                f = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class RemoveChatItemAction extends aopi implements aoqv {
        public static final RemoveChatItemAction a;
        private static volatile aorb c;
        public static final aopg removeChatItemAction;
        public String b = "";
        private int d;

        static {
            RemoveChatItemAction removeChatItemAction2 = new RemoveChatItemAction();
            a = removeChatItemAction2;
            aopi.registerDefaultInstance(RemoveChatItemAction.class, removeChatItemAction2);
            removeChatItemAction = aopi.newSingularGeneratedExtension(apzg.a, removeChatItemAction2, removeChatItemAction2, null, 130295727, aosj.MESSAGE, RemoveChatItemAction.class);
        }

        private RemoveChatItemAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            switch (aophVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
                case 3:
                    return new RemoveChatItemAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = c;
                    if (aorbVar == null) {
                        synchronized (RemoveChatItemAction.class) {
                            aorbVar = c;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                c = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class ReplaceChatItemAction extends aopi implements aoqv {
        public static final ReplaceChatItemAction a;
        private static volatile aorb d;
        public static final aopg replaceChatItemAction;
        public asqy c;
        private int e;
        private byte f = 2;
        public String b = "";

        static {
            ReplaceChatItemAction replaceChatItemAction2 = new ReplaceChatItemAction();
            a = replaceChatItemAction2;
            aopi.registerDefaultInstance(ReplaceChatItemAction.class, replaceChatItemAction2);
            replaceChatItemAction = aopi.newSingularGeneratedExtension(apzg.a, replaceChatItemAction2, replaceChatItemAction2, null, 149968475, aosj.MESSAGE, ReplaceChatItemAction.class);
        }

        private ReplaceChatItemAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            byte b = 1;
            switch (aophVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.f);
                case 1:
                    if (obj == null) {
                        b = 0;
                    }
                    this.f = b;
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"e", "b", "c"});
                case 3:
                    return new ReplaceChatItemAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = d;
                    if (aorbVar == null) {
                        synchronized (ReplaceChatItemAction.class) {
                            aorbVar = d;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                d = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class ReplayChatItemAction extends aopi implements aoqv {
        public static final ReplayChatItemAction a;
        private static volatile aorb d;
        public static final aopg replayChatItemAction;
        public long c;
        private int e;
        private byte f = 2;
        public aopu b = emptyProtobufList();

        static {
            ReplayChatItemAction replayChatItemAction2 = new ReplayChatItemAction();
            a = replayChatItemAction2;
            aopi.registerDefaultInstance(ReplayChatItemAction.class, replayChatItemAction2);
            replayChatItemAction = aopi.newSingularGeneratedExtension(apzg.a, replayChatItemAction2, replayChatItemAction2, null, 145132565, aosj.MESSAGE, ReplayChatItemAction.class);
        }

        private ReplayChatItemAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            byte b = 1;
            switch (aophVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.f);
                case 1:
                    if (obj == null) {
                        b = 0;
                    }
                    this.f = b;
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဂ\u0000", new Object[]{"e", "b", apzg.class, "c"});
                case 3:
                    return new ReplayChatItemAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = d;
                    if (aorbVar == null) {
                        synchronized (ReplayChatItemAction.class) {
                            aorbVar = d;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                d = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class ShowLiveChatActionPanelAction extends aopi implements aoqv {
        public static final ShowLiveChatActionPanelAction a;
        private static volatile aorb d;
        public static final aopg showLiveChatActionPanelAction;
        public int b;
        public aunb c;
        private byte e = 2;

        static {
            ShowLiveChatActionPanelAction showLiveChatActionPanelAction2 = new ShowLiveChatActionPanelAction();
            a = showLiveChatActionPanelAction2;
            aopi.registerDefaultInstance(ShowLiveChatActionPanelAction.class, showLiveChatActionPanelAction2);
            showLiveChatActionPanelAction = aopi.newSingularGeneratedExtension(apzg.a, showLiveChatActionPanelAction2, showLiveChatActionPanelAction2, null, 238110852, aosj.MESSAGE, ShowLiveChatActionPanelAction.class);
        }

        private ShowLiveChatActionPanelAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            byte b = 1;
            switch (aophVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.e);
                case 1:
                    if (obj == null) {
                        b = 0;
                    }
                    this.e = b;
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
                case 3:
                    return new ShowLiveChatActionPanelAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = d;
                    if (aorbVar == null) {
                        synchronized (ShowLiveChatActionPanelAction.class) {
                            aorbVar = d;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                d = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class ShowLiveChatDialogAction extends aopi implements aoqv {
        public static final ShowLiveChatDialogAction a;
        private static volatile aorb d;
        public static final aopg showLiveChatDialogAction;
        public int b;
        public aunb c;
        private byte e = 2;

        static {
            ShowLiveChatDialogAction showLiveChatDialogAction2 = new ShowLiveChatDialogAction();
            a = showLiveChatDialogAction2;
            aopi.registerDefaultInstance(ShowLiveChatDialogAction.class, showLiveChatDialogAction2);
            showLiveChatDialogAction = aopi.newSingularGeneratedExtension(apzg.a, showLiveChatDialogAction2, showLiveChatDialogAction2, null, 171299322, aosj.MESSAGE, ShowLiveChatDialogAction.class);
        }

        private ShowLiveChatDialogAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            byte b = 1;
            switch (aophVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.e);
                case 1:
                    if (obj == null) {
                        b = 0;
                    }
                    this.e = b;
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
                case 3:
                    return new ShowLiveChatDialogAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = d;
                    if (aorbVar == null) {
                        synchronized (ShowLiveChatDialogAction.class) {
                            aorbVar = d;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                d = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class UpdateLiveChatPollAction extends aopi implements aoqv {
        public static final UpdateLiveChatPollAction a;
        private static volatile aorb d;
        public static final aopg updateLiveChatPollAction;
        public int b;
        public aunb c;
        private byte e = 2;

        static {
            UpdateLiveChatPollAction updateLiveChatPollAction2 = new UpdateLiveChatPollAction();
            a = updateLiveChatPollAction2;
            aopi.registerDefaultInstance(UpdateLiveChatPollAction.class, updateLiveChatPollAction2);
            updateLiveChatPollAction = aopi.newSingularGeneratedExtension(apzg.a, updateLiveChatPollAction2, updateLiveChatPollAction2, null, 239281785, aosj.MESSAGE, UpdateLiveChatPollAction.class);
        }

        private UpdateLiveChatPollAction() {
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            byte b = 1;
            switch (aophVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.e);
                case 1:
                    if (obj == null) {
                        b = 0;
                    }
                    this.e = b;
                    return null;
                case 2:
                    return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
                case 3:
                    return new UpdateLiveChatPollAction();
                case 4:
                    return new aopa(a);
                case 5:
                    return a;
                case 6:
                    aorb aorbVar = d;
                    if (aorbVar == null) {
                        synchronized (UpdateLiveChatPollAction.class) {
                            aorbVar = d;
                            if (aorbVar == null) {
                                aorbVar = new aopb(a);
                                d = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    private LiveChatAction() {
    }
}
