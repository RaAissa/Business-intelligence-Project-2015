%~d0
 cd %~dp0
 java -Xms256M -Xmx1024M -cp ../lib/systemRoutines.jar;../lib/userRoutines.jar;.;travail_final_0_1.jar;../lib/advancedPersistentLookupLib-1.0.jar;../lib/commons-collections-3.2.jar;../lib/dom4j-1.6.1.jar;../lib/external_sort.jar;../lib/jboss-serialization.jar;../lib/log4j-1.2.15.jar;../lib/mysql-connector-java-5.1.30-bin.jar;../lib/talendcsv.jar;../lib/talend_file_enhanced_20070724.jar;../lib/trove.jar; projectname.travail_final_0_1.Travail_final --context=Default %* 